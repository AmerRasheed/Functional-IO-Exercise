package org.example.exerciseData;

import java.io.*;

public class ExerciseCopyService {

public static void copyWithBuffers(File source, File destination) {
    try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
         BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = in.read(buffer)) > 0) {
            out.write(buffer, 0, bytesRead);  // off (off set i.e. from where it starts)
            out.flush();
        }

    } catch (IOException ex) {
        ex.printStackTrace();
    }

}

}
