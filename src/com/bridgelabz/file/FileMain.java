package com.bridgelabz.file;

import java.io.IOException;

public class FileMain {
    public static void main(String[] args) {
        FileMethods fm = new FileMethods();


        try {
            fm.printWriterWrite("src/com/bridgelabz/file/sample.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
