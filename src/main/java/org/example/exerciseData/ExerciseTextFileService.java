package org.example.exerciseData;

import java.io.*;

public class ExerciseTextFileService {

    public static void writeString (File destination, String source)
    {
        try(FileWriter writer= new FileWriter(destination))
        {
            if(!destination.exists())
            {
                destination.createNewFile();
            }
            writer.write(source);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String readFromTextFile(File source) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        FileReader readerExercise = new FileReader(source);
        int i;
        while ((i=readerExercise.read()) != -1) {
            char letter = (char) i;
            stringBuilder.append(letter);
        }
        return stringBuilder.toString();
    }
}
