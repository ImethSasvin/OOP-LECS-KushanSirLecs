package com.iit.oop.week6;

import java.io.File;

public class ListFile {
    public static void main(String[] args) {
        File currentDirectory = new File("./src/com/iit/oop");

        String [] content = currentDirectory.list();

        for (String item : content){
            System.out.println(item);
        }


    }
}
