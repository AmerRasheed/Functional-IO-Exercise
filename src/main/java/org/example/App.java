package org.example;

import org.example.exerciseData.ExerciseCopyService;
import org.example.exerciseData.ExerciseTextFileService;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        //Practice 1.
        // Create a textfile (.txt) and fill it with some text content.
        // Tip: you can find random text here.
        // a. In Java create a method that read in a String from file and return the String using FileReader.

        // Creating a text file
        File textFilePrace1 = new File("source/Practice1.txt");
        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        ExerciseTextFileService.writeString(textFilePrace1, string);

        try {
            String result = ExerciseTextFileService.readFromTextFile(textFilePrace1); //by clicking on readFromTextFile invokes "throws IOException"
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Practice 3. In Java create a Collection that contains at least five String objects.
        // a. Then create a method that write each String object from the collection into a textfile.
        File textFilePrace3 = new File("source/Practice3.txt");
        List<String> collectionPractice3 = Arrays.asList("Amer","Erik","Martin","Tobias","Ulf");
        ExerciseTextFileService.writetoFile(textFilePrace3, collectionPractice3);                  //Written  Amer,Erik,Martin,Tobias,Ulf in the text file

        //Practice 2
        /*I AM DOING PRACTICE 2 AFTER PRACTICE 3 SINCE I AM USING TEXT FILE MANUFACTURED (WRITTEN) IN PRACTICE 3*/
        // Create a textfile (.txt) and fill it with lines of names.
        // a. In Java create a method that read in the lines into a Collection of your choice using BufferedReader.
        // One line for each element in the Collection.
        //File textFilePrace2 = new File("source/Practice2.txt");
        String result = ExerciseTextFileService.readFromTextFile(textFilePrace3);
        System.out.println(result);   // Displaying contents of file (Written with FIVE String Objects)  //Outputs  Amer
                                                                                                         //         Erik
                                                                                                         //         Martin
                                                                                                         //         Tobias
                                                                                                         //         Ulf


        //Practice 4. Create a method that can copy a file using both BufferedInputStream and BufferedOutputStream.
        File source = new File("source/AmerSnap_copy.png");
        File destination = new File("destination/destination_AmerSnap.png");
        ExerciseCopyService.copyWithBuffers(source,destination);
    }

}
// How to create Text File
//1 creating a file                   App
//2 writeString method in class
//3 readfromFile method in class
//4 Creating string "hello"            App
//5 Executing writeString method above APP