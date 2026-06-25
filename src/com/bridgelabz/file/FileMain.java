package com.bridgelabz.file;

import java.io.IOException;

public class FileMain {
    public static void main(String[] args) {
        FileMethods fm = new FileMethods();

        try {
            fm.create("src/com/bridgelabz/file/sample2.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
