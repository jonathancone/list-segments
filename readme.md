list-segments - Java 9 Modules
---

**Compile the module**
```bash
# Compile
javac -d mods/com.opensource -sourcepath src/main/java src/main/java/com/opensource/Main.java 

# View
tree mods/com.opensource
```
**Run the module**
```bash
java --module-path mods -m com.opensource/com.opensource.Main
```
**Create a modular JAR file**
```bash
# Create it
jar cfev0 com.opensource.jar com.opensource.Main mods/com.opensource -C mods/com.opensource com

# Run it
java -jar com.opensource.jar blue cyan

# Unzip it
unzip com.opensource.jar -d jar-contents
```
**See module dependencies**
```bash
jdeps com.opensource.jar 
```
**Create a runtime image**
```bash
jlink --module-path ~/.jenv/versions/9/jmods:mods --add-modules com.opensource --output output --launcher ls=com.opensource/com.opensource.Main

# Compare JVM size
du -sh $(/usr/libexec/java_home)

# With module size
du -sh output
```
**Run the linked image**
```bash
./output/bin/ls purple yellow
```
**View the image disk space**
```bash
du -sh output
```
**Create a jmod file**
```bash
jmod create --class-path mods/com.opensource com.opensource.jmod
```
