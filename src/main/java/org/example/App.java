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
        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        ExerciseTextFileService.writeString(textFile, string);

        try {
            String result = ExerciseTextFileService.readFromTextFile(textFile); //by clicking on readFromTextFile invokes "throws IOException"
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
// How to create Text File
//1 creating a file                   App
//2 writeString method in class
//3 readfromFile method in class
//4 Creating string "hello"            App
//5 Executing writeString method above APP