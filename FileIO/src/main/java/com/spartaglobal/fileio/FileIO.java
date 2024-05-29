package com.spartaglobal.fileio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileIO {

    public static void main(String[] args) {
        String myPathString = "src/main/resources/Todo.txt";
        String myPathString2 = "src/main/resources/Output.txt";
        List<String> result = readAllLines(myPathString);
        System.out.println(result);
        readAllLines(myPathString);
        
        write(myPathString2, result);

    }

    public static List<String> readAllLines(String pathString) {
        Path path = Paths.get(pathString);
        List<String> finalList = null;
        try {
            finalList = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return finalList;
    }

    public static void readLineByLine(String pathString) {
        String line;
        BufferedReader reader = null;
        Path path;
        
        try {
            reader = Files.newBufferedReader(Paths.get(pathString));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void write(String pathString, List<String> textToWrite) {
        for (String listItem : textToWrite) {
            try {
                Path path = Paths.get(pathString);
                if (!Files.exists(path)){
                    Files.createFile(path);
                }
                listItem += "\n";
                Files.write(path, listItem.getBytes(), StandardOpenOption.APPEND);
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
