package org.example;

import org.example.exerciseData.ExerciseCopyService;
import org.example.exerciseData.ExerciseTextFileService;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        //1. Create a textfile (.txt) and fill it with some text content.
        // Tip: you can find random text here.
        // a. In Java create a method that read in a String from file and return the String using FileReader.

        // Creating a text file
        File textFile = new File("source/exercise.txt");
        String string = "hello";
        ExerciseTextFileService.writeString(textFile, string);

        try {
            String result = ExerciseTextFileService.readFromTextFile(textFile); //by clicking on readFromTextFile invokes "throws IOException"
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
