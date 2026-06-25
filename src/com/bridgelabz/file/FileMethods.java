package com.bridgelabz.file;

import java.io.*;

public class FileMethods {
    //creating file
    public void create(String path) throws IOException {
        File file = new File(path);

            if(file.createNewFile()){
                System.out.println(" file is created");
            }
            else{
                System.out.println("No file created");
            }


    }

    //check file
    public boolean checkFile(String path){
        File file = new File(path);
        return file.exists();
    }

    //get file name
    public String getingName(String path){
        File file = new File(path);
        return file.getName();
    }

    //get absolute file name
    public String getAbsName(String path){
        File file = new File(path);
        return file.getAbsolutePath();

    }

    //finding length of file in bytecode
    public long getLength(String path){
        File file = new File(path);
        return file.length();

    }

    //check is file can be read
    public boolean checkRead(String path){
        File file = new File(path);
        return file.canRead();

    }
    //check is file can be written
    public boolean checkWrite(String path){
        File file = new File(path);
        return file.canRead();

    }

    //check the path is of file

    public boolean checkItIsFile(String path){
        File file = new File(path);
        return file.isFile();

    }

    //rename file

    public boolean renamingFile(String path){
        File oldFile = new File(path);
        File newFile = new File("src/com/bridgelabz/file/sample10.txt");
        return oldFile.renameTo(newFile);

    }

    //reading file
    public void readingFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        int ch;
        while ((ch=fileReader.read())!=-1){
            System.out.println((char)(ch));
        }

        fileReader.close();
    }

    public void writingFie(String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path,true);

        fileWriter.write("\nHello java");
        fileWriter.close();

    }




}
