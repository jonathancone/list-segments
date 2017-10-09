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
**Create a runtime image**
```bash
jlink --module-path ~/.jenv/versions/9/jmods:mods --add-modules com.opensource --output output --launcher ls=com.opensource/com.opensource.Main
```
**Create a jmod file**
```bash
jmod create --class-path mods/com.opensource com.opensource.jmod
```
