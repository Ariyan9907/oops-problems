package com.bridgelabz.file;

import java.io.File;
import java.io.IOException;

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


}
