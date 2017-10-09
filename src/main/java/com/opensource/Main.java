package com.opensource;

import com.opensource.color.Color;
import com.opensource.file.FileTools;

public class Main {

    public static void main(String[] args) {

        String directory = System.getProperty("user.dir");

        Color directoryColor = Color.ANSI_RED;
        Color fileColor = Color.ANSI_RED;

        if (args.length > 0) {
            directoryColor = Color.byName(args[0]);
        }

        if (args.length > 1) {
            fileColor = Color.byName(args[1]);
        }

        System.out.println(FileTools.listSegments(directory, directoryColor, fileColor));
    }
}
