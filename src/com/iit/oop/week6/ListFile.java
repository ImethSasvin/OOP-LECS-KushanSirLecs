package com.iit.oop.week6;

import java.io.*;

public class ListFile {
    public static void main(String[] args) {
        File currentDirectory = new File("./src/com/iit/oop/week6");

        String[] content = currentDirectory.list();

        try {
            for (String item : content) {
                if(!new File(item).isFile()) {
                    continue;}
                System.out.println(item);
                try {
                    FileReader reader = new FileReader(new File(currentDirectory, item));
                    System.out.println(reader.read());
                    FileWriter writer  =  new FileWriter(new File(currentDirectory, "list.txt"), true);
                    writer.write(item+ "\n");
                    writer.close();
                } catch (FileNotFoundException e) {
                    System.out.println("The file is not readable...");
                }catch (IOException e){
                    System.out.println("The file is not writable...");
                }
            }
        } catch (NullPointerException e) {
            System.out.println("The path is wrong...");
        }
    }
}