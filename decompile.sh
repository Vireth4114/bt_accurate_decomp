if [ $# -ne 1 ]; then
    echo "Usage: $0 <input_jar>"
    exit 1
fi

input_jar=$1

unzip -o $input_jar -d input_dir
javap -p -s -c input_dir/*.class > raw_javap.txt
rm -rf input_dir

python create_mapping_file.py $input_jar

java -jar jar-utils/tiny-remapper-0.14.1-fat.jar $input_jar output.jar mapping.tiny obf named
unzip -o output.jar -d output_dir

if [ ! -d "output_decompiled" ]; then
    mkdir output_decompiled
fi

java -jar jar-utils/vineflower.jar output.jar output_decompiled
unzip -o output.jar -d input_dir
javap -p -s -c input_dir/*.class > javap.txt
python remove_index_and_branches.py javap.txt

if [ ! -d "src" ]; then
    mkdir src
fi

if [ ! -d "res" ]; then
    mkdir res
fi

if [ -d "META-INF" ]; then
    rm -rf META-INF
fi

mv output_decompiled/META-INF .
mv output_decompiled/*.java src
mv output_decompiled/* res

rm output.jar
rm mapping.tiny
rm -rf input_dir
rm -rf output_dir
rm -rf output_decompiled