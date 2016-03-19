package com.josh;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;


public class Main {

    public static void main(String[] args) throws IOException {
       FileReader readme = new FileReader("coffee.txt");  //give file a variable
        BufferedReader bufReader = new BufferedReader(readme);  //

        ArrayList inputList = new ArrayList();
        String line = bufReader.readLine();

        /*while (line != null) {
            line = bufReader.readLine();                //printing out the file information
            System.out.println(line);
        }*/

        while (line != null) {
            System.out.println(line);
            String [] item = line.split(";");
            inputList.add(item[0]);
            inputList.add(Double.parseDouble(item[1]));
            inputList.add(Double.parseDouble(item[2]));
            line = bufReader.readLine();
        }

        System.out.println(inputList);

                //Drink espresso =
                 //    new Drink(ArrayList(0), temp1FromString, temp2FromString);
            }
    }

