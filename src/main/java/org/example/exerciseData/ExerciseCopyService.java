package org.example.exerciseData;

import java.io.*;

public class ExerciseCopyService {


    public static void copy(File source, File destination)
    {
try (
        FileInputStream in= new FileInputStream(source);
        FileOutputStream out = new FileOutputStream(destination);
        ){
    int b;
    while ((b=in.read())!= -1)
        out.write(b);
}
catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
    }
}
