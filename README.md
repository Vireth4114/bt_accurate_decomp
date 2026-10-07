# Bounce Tales Accurate Decompilation

Favoring accuracy over readability (if you want that use the far better (and bit more legal, don't bonk me Rovio) [decompilation by HelloOO7](https://github.com/HelloOO7/BounceTales))

This works but I'm not sure how accurate it is

## Files

`decompile.sh` is a file which rename methods and fields of the bytecode with [TinyRemapper](https://github.com/FabricMC/tiny-remapper) and decompiles the output with [VineFlower](https://github.com/Vineflower/vineflower), it's not really a file you would run but it's what was used to generate initial code, it generates a `javap.txt` without line count, index and branch count, switch tables to easily compare it.

Build and run the game with jdk 6u3 and [Nokia S40 SDK](https://archive.org/download/nokia_sdks_n_dev_tools2/Series_40_5th_Edition_SDK_Feature_Pack_1_1_0.zip) using `ant build`/`ant run` (you may/will have to change the properties in `build.xml` to get it to run properly), it generates a `built_javap.txt` the same way as `javap.txt`
