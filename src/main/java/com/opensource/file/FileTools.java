package com.opensource.file;

import com.opensource.color.Color;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class FileTools {

    public static String listSegments(String path, Color directory, Color file) {
        try {
            return Files.list(Paths.get(path))
                    .map(Path::toFile)
                    .map(f -> (f.isDirectory() ? directory : file).getCode() + f.getName() + Color.ANSI_RESET.getCode())
                    .sorted()
                    .collect(Collectors.joining("\n"));


        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
