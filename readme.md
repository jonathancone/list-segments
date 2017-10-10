list-segments - Java 9 Modules
---

**Compile the module**
```bash
javac -d mods/com.opensource src/main/java/module-info.java  src/main/java/com/opensource/Main.java src/main/java/com/opensource/file/FileTools.java src/main/java/com/opensource/color/Color.java
```
**Run the module**
```bash
java --module-path mods -m com.opensource/com.opensource.Main
```
**Create a modular JAR file**
```bash
# Create it
jar cfev0 com.opensource.jar com.opensource.Main target/classes -C target/classes com

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
