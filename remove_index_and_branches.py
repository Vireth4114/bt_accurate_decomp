import sys
import re

input_javap_file = sys.argv[1] if len(sys.argv) > 1 else exit("Please provide the path to the javap file as an argument.")

with open(input_javap_file, 'r') as file:
    lines = file.read().splitlines()

new_lines = []
in_switch = False
in_exception_table = False

for line in lines:
    new_line = line
    previous_in_switch = in_switch
    if match := re.match(r'^\s{4,10}\d+: (\w+)(?:(\s+#)\d+(.*?)\s*(\s{4}\/\/.*))?(.*)$', line):
        new_line = f"      {''.join(group or '' for group in match.groups())}"
        command = match.group(1)
        if command == "lookupswitch" or command == "tableswitch":
            in_switch = True
        if command.startswith("if") or command.startswith("goto"):
            new_line = f"      {command}"

    if "Exception table:" in line:
        in_exception_table = True

    if in_exception_table:
        if new_line.strip() == "":
            in_exception_table = False
        new_line = re.sub(r'^\s+\d+\s+\d+\s+\d+\s+', '            ', new_line)
    
    if in_switch and re.search(r'\}', line):
        in_switch = False

    if not previous_in_switch:
        new_lines.append(new_line)

with open(f"comparable_{input_javap_file}", 'w') as output_file:
    output_file.write("\n".join(new_lines) + "\n")