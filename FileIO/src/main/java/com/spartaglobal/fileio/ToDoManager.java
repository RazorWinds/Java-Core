package com.spartaglobal.fileio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ToDoManager {

    private List<ToDo> toDos = new ArrayList<>();

    public List<ToDo> readToDosFromFile(String fileName) {
        Path thePath = Paths.get(fileName);
        String line;
        try (BufferedReader reader = Files.newBufferedReader(thePath)) {
            while ((line = reader.readLine()) != null) {
                toDos.add(createToDo(line));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return toDos;
    }

    public ToDo createToDo(String line) {
        var splitLine = line.split(",");
        String description = splitLine[0].trim();
        String who = splitLine[1].trim();
        String estimatedTime = splitLine[2].trim();
        String startDate = splitLine[3].trim();
        String finished = splitLine[4].trim();
        return new ToDo(description, who, estimatedTime, startDate, finished);
    }
}
