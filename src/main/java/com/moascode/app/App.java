package com.moascode.app;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println( "Hello World!" );
        writeToFile();
    }

    public static void writeToFile() {
        try {
            File myObj = new File("/opt/filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
