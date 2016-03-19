package com.josh;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.text.ParseException;
import java.util.DoubleSummaryStatistics;


public class Main {

    public static void main(String[] args) throws IOException {
       FileReader readme = new FileReader("coffee.txt");  //give file a variable
        BufferedReader bufReader = new BufferedReader(readme);  //
        String line = bufReader.readLine();

        /*while (line != null) {
            line = bufReader.readLine();
            System.out.println(line);
        }*/
        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 3; y++) {
                String[] temp = line.split(";");
                String drinkName = temp[x];
                String temp0 = temp[0];  //drink name
                String temp1 = temp[1];  //drink cost to make
                String temp2 = temp[2];  //drink cost sold
                double temp1FromString = Double.parseDouble(temp1);
                double temp2FromString = Double.parseDouble(temp2);


                System.out.println(temp[x]);

                Drink drinkName =
                        new Drink(temp0, temp1FromString, temp2FromString);

                Drink espresso =
                        new
            }
            }
    }
}
