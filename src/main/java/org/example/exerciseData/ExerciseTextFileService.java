package org.example.exerciseData;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

    public static List<String> writetoFile(File destination, List<String> src)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destination)))
        {
            for (String toWrite : src)
            { writer.write(toWrite); writer.newLine(); }
            writer.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return src;
    }

    public static List<String> readFromLine(File file){
        List<String> strings = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file)))
        {
            String line;
            while((line=reader.readLine())!=null)
                strings.add(line);

        }catch (IOException e){
            e.printStackTrace();
        }
        return strings;
    }
}
