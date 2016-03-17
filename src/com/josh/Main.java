package com.josh;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


public class Main {

    public static void main(String[] args) throws IOException {
       FileReader readme = new FileReader("coffee.txt");  //give file a variable
        BufferedReader bufReader = new BufferedReader(readme);  //
        String line = bufReader.readLine();

        while (line != null) {
            line = bufReader.readLine();
            System.out.println(line);

        }

    }
}
