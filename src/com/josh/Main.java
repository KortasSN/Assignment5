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
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        FileReader readme = new FileReader("coffee.txt");  //give file a variable
        BufferedReader bufReader = new BufferedReader(readme);  //

        ArrayList inputList = new ArrayList();     //ArrayList to save the coffee.txt into
        String line = bufReader.readLine();

        /*while (line != null) {
            line = bufReader.readLine();                //printing out the file information
            System.out.println(line);
        }*/

        while (line != null) {                                  //loop to put coffee.txt into arraylist
            String[] item = line.split(";");
            int z = 0;
            inputList.add(item[z]);
            inputList.add(Double.parseDouble(item[z + 1]));
            inputList.add(Double.parseDouble(item[z + 2]));
            line = bufReader.readLine();

            String tempName = item[0];
            double tempCostToMake = Double.parseDouble(item[1]);
            double tempCostToCustomer = Double.parseDouble(item[2]);

            z = z + 3;

            //System.out.println(inputList);
            //getData.Drink(inputList);


            Drink cappuccino =
                    new Drink(tempName, tempCostToMake, tempCostToCustomer);
            cappuccino.sold();
            cappuccino.writeEndOfDay();

            Drink espresso =
                    new Drink(tempName, tempCostToMake, tempCostToCustomer);

        }
    }
}


