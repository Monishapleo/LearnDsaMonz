package com.learn.dsa.java8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("test-file");
        try{

            HashMap hash=new HashMap<>();

            if(file.createNewFile()){
                System.out.println("File created : "+file.getName());
            }else{
                System.out.println("=========File already created==========");
                System.out.println("File path : "+file.getAbsolutePath());
                if (file.delete()) {
                    System.out.println("Deleted the file: " + file.getName());
                } else {
                    System.out.println("Failed to delete the file.");
                }

            }
            FileWriter fileWriter = new FileWriter("test-file");
            fileWriter.write("Hello how are you !!! hope you are doing good!!!");
            fileWriter.write("\nI'm pretty...!!!");
            fileWriter.close();

            System.out.println("Successfully written.");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();
        }catch (Exception e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
