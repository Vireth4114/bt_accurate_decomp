import re
import os
import sys
import shutil

input_jar = sys.argv[1] if len(sys.argv) > 1 else exit("Please provide the input JAR file as an argument.")

os.system(f"unzip -o {input_jar} -d input_dir")

os.system(f"javap -p -s -c input_dir/*.class > raw_javap.txt")

shutil.rmtree("input_dir")

with open("raw_javap.txt", "r") as file:
    lines = file.read().splitlines()

def get_array_name(bleh):
    if bleh[0] != '[':
        return bleh[0]
    return 'Array' + get_array_name(bleh[1:])

def split_part(part):
    rsl = []
    for idx, char in enumerate(part):
        if part[idx - 1] == '[':
            continue
        if char == '[':
            rsl.append(get_array_name(part[idx:]))
        else:
            rsl.append(char)
    return rsl

def get_name(type, descriptor, name):
    if len(name) > 2:
        return name
    parsed = descriptor.replace('(', '').replace(')', '')
    first, *classes = parsed.split('L')
    next_class_is_array = False
    if first.endswith('['):
        next_class_is_array = True
        first = first[:-1]
    full_parsed = '_'.join(split_part(first))
    for klass in classes:
        class_name, rest = klass.split('/')[-1].split(';')
        if full_parsed:
            full_parsed += '_'
        if next_class_is_array:
            full_parsed += 'Array'
        full_parsed += class_name
        next_class_is_array = False
        if rest:
            if rest.endswith('['):
                next_class_is_array = True
                rest = rest[:-1]
            full_parsed += '_' + '_'.join(split_part(rest)) 
    return ("method_" if type == "m" else "") + name + "_" + full_parsed

def parse(line, descriptor_line):
    descriptor = re.search(r".*descriptor:\s+(\S+)", descriptor_line).group(1)

    if search := re.search(r"(\w+)\(", line):
        if re.match(r"^\s*(public|private|protected)?\s*\w+\(.*$", line):
            return None
        return "m", descriptor, search.group(1)
    elif search := re.search(r"(\w+);", line):
        return "f", descriptor, search.group(1)


new_lines = []
skip = False

for line, next_line in zip(lines, lines[1:] + [None]):
    if class_name := re.search(r"class\s+(\S+).*\{", line):
        name = class_name.group(1)
        if name == "RMIDlet":
            skip = True
            continue
        skip = False
        new_lines.append(f"c\t{name}\t{name}")
        continue
    if skip:
        continue
    if re.search(r"\{\}", line):
        continue
    if next_line and re.search(r"descriptor", next_line):
        parsed = parse(line, next_line)
        if parsed:
            new_lines.append("\t" + "\t".join(parsed[:3] + (get_name(*parsed),)))

with open("mapping.tiny", "w") as file:
    print("tiny\t2\t0\tobf\tnamed", file=file)
    for line in new_lines:
        print(line, file=file)

os.system(f"java -jar jar-utils/tiny-remapper-0.14.1-fat.jar {input_jar} output.jar mapping.tiny obf named")
os.system(f"unzip -o output.jar -d output_dir")
if not os.path.exists("output_decompiled"):
    os.mkdir("output_decompiled")
os.system(f"java -jar jar-utils/vineflower.jar output.jar output_decompiled")
os.system(f"unzip -o output.jar -d input_dir")
os.system(f"javap -p -s -c input_dir/*.class > raw_javap.txt")
if not os.path.exists("src"):
    os.mkdir("src")
if not os.path.exists("res"):
    os.mkdir("res")
if os.path.exists("META-INF"):
    shutil.rmtree("META-INF")
os.system(f"mv output_decompiled/META-INF .")
os.system(f"mv output_decompiled/*.java src")
os.system(f"mv output_decompiled/* res")
os.remove("output.jar")
os.remove("mapping.tiny")
shutil.rmtree("input_dir")
shutil.rmtree("output_dir")
shutil.rmtree("output_decompiled")