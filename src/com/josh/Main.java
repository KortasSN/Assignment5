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
            inputList.add(item[z + 1]);
            inputList.add(Double.parseDouble(item[z + 2]));
            line = bufReader.readLine();

            z = z + 3;
        }
        bufReader.close();

        System.out.println(inputList);
        String tempName = inputList.get(0).toString();
        double tempCostToMake = Double.parseDouble(inputList.get(1).toString());
        double tempCostToCustomer = Double.parseDouble(inputList.get(2).toString());

        /*    Drink cappuccino =
                    new Drink(inputList.get(0).toString(), Double.parseDouble(inputList.get(1).toString()), (inputList.get(2).toString()); //tempName, tempCostToMake, tempCostToCustomer
            cappuccino.sold();
            cappuccino.writeEndOfDay();
        */
        //method to change variable z and to
        Drink cappuccino =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        cappuccino.sold();
        cappuccino.writeEndOfDay();

        tempName = inputList.get(3).toString();
        tempCostToMake = Double.parseDouble(inputList.get(4).toString());
        tempCostToCustomer = Double.parseDouble(inputList.get(5).toString());

        Drink espresso =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        espresso.sold();
        espresso.writeEndOfDay();


        Drink latte =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        latte.sold();
        latte.writeEndOfDay();

        Drink blackTea =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        blackTea.sold();
        blackTea.writeEndOfDay();

        Drink herbalTea =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        herbalTea.sold();
        herbalTea.writeEndOfDay();

        Drink macchiato =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        macchiato.sold();
        macchiato.writeEndOfDay();

        Drink americano =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        americano.sold();
        americano.writeEndOfDay();

        Drink coldPress =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        coldPress.sold();
        coldPress.writeEndOfDay();

        Drink hotChocolate =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        hotChocolate.sold();
        hotChocolate.writeEndOfDay();

        Drink chaiTea =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        chaiTea.sold();
        chaiTea.writeEndOfDay();

        Drink mocha =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        chaiTea.sold();
        chaiTea.writeEndOfDay();







    }
    /*private static String, double, double getData(ArrayList inputList) {
        tempName = inputList.get(3).toString();
        tempCostToMake = Double.parseDouble(inputList.get(4).toString());
        tempCostToCustomer = Double.parseDouble(inputList.get(5).toString());

        return tempName, tempCostToMake, tempCostToCustomer;
*/
    }
}

