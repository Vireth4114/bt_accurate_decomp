# Bounce Tales Accurate Decompilation

Favoring accuracy over readability (if you want that use the far better (and bit more legal, don't bonk me Rovio) [decompilation by HelloOO7](https://github.com/HelloOO7/BounceTales))

<sub>Uh currently this doesn't really work blep</sub>

## Files

`mapper.py` is a badly named file which rename methods and fields of the bytecode with [TinyRemapper](https://github.com/FabricMC/tiny-remapper) and decompiles the output with [VineFlower](https://github.com/Vineflower/vineflower), it's not really a file you would run but it's what was used to generate initial code.

Build and run the game with jdk 6u3 and [Nokia S40 SDK](https://archive.org/download/nokia_sdks_n_dev_tools2/Series_40_5th_Edition_SDK_Feature_Pack_1_1_0.zip) using `ant build`/`ant run` (you may/will have to change the properties in `build.xml` to get it to run properly)
