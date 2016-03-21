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

        int y = 0;

    System.out.println(inputList);     //testing purposes
    String tempName = inputList.get(y).toString();      //workaround which is way to much code
    double tempCostToMake = Double.parseDouble(inputList.get(y + 1).toString());      //workaround which is way too much code
    double tempCostToCustomer = Double.parseDouble(inputList.get(y + 2).toString());     //workaround which is way too much code

        /*    Drink cappuccino =
                    new Drink(inputList.get(0).toString(), Double.parseDouble(inputList.get(1).toString()), (inputList.get(2).toString()); //tempName, tempCostToMake, tempCostToCustomer
            cappuccino.sold();
            cappuccino.writeEndOfDay();
        */

        Drink cappuccino =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        cappuccino.sold();        //method to get amount sold
        cappuccino.writeEndOfDay();       //method to write file

        /*tempName = inputList.get(y).toString();
        tempCostToMake = Double.parseDouble(inputList.get(y + 1).toString());
        tempCostToCustomer = Double.parseDouble(inputList.get(y + 2).toString());
*/
        y = y + 3;
        Drink espresso =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        espresso.sold();
        espresso.writeEndOfDay();

        y = y + 3;
        tempName = inputList.get(y).toString();
        tempCostToMake = Double.parseDouble(inputList.get(y + 1).toString());
        tempCostToCustomer = Double.parseDouble(inputList.get(y + 2).toString());

        Drink latte =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        latte.sold();
        latte.writeEndOfDay();

        y = y + 3;
        tempName = inputList.get(y).toString();
        tempCostToMake = Double.parseDouble(inputList.get(y + 1).toString());
        tempCostToCustomer = Double.parseDouble(inputList.get(y + 2).toString());

        Drink blackTea =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        blackTea.sold();
        blackTea.writeEndOfDay();

        y = y + 3;
        tempName = inputList.get(y).toString();
        tempCostToMake = Double.parseDouble(inputList.get(y + 1).toString());
        tempCostToCustomer = Double.parseDouble(inputList.get(y + 2).toString());

        Drink herbalTea =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        herbalTea.sold();
        herbalTea.writeEndOfDay();
        y = y + 3;
        tempName = inputList.get(y).toString();
        tempCostToMake = Double.parseDouble(inputList.get(y + 1).toString());
        tempCostToCustomer = Double.parseDouble(inputList.get(y + 2).toString());


        Drink macchiato =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        macchiato.sold();
        macchiato.writeEndOfDay();
        y = y + 3;
        tempName = inputList.get(y).toString();
        tempCostToMake = Double.parseDouble(inputList.get(y + 1).toString());
        tempCostToCustomer = Double.parseDouble(inputList.get(y + 2).toString());


        Drink americano =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        americano.sold();
        americano.writeEndOfDay();
        y = y + 3;
        tempName = inputList.get(y).toString();
        tempCostToMake = Double.parseDouble(inputList.get(y + 1).toString());
        tempCostToCustomer = Double.parseDouble(inputList.get(y + 2).toString());


        Drink coldPress =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        coldPress.sold();
        coldPress.writeEndOfDay();
        y = y + 3;
        tempName = inputList.get(y).toString();
        tempCostToMake = Double.parseDouble(inputList.get(y + 1).toString());
        tempCostToCustomer = Double.parseDouble(inputList.get(y + 2).toString());


        Drink hotChocolate =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        hotChocolate.sold();
        hotChocolate.writeEndOfDay();
        y = y + 3;
        tempName = inputList.get(y).toString();
        tempCostToMake = Double.parseDouble(inputList.get(y + 1).toString());
        tempCostToCustomer = Double.parseDouble(inputList.get(y + 2).toString());

        Drink coffee =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        coffee.sold();
        coffee.writeEndOfDay();
        y = y + 3;
        tempName = inputList.get(y).toString();
        tempCostToMake = Double.parseDouble(inputList.get(y + 1).toString());
        tempCostToCustomer = Double.parseDouble(inputList.get(y + 2).toString());

        Drink chaiTea =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        chaiTea.sold();
        chaiTea.writeEndOfDay();
        y = y + 3;
        tempName = inputList.get(y).toString();
        tempCostToMake = Double.parseDouble(inputList.get(y + 1).toString());
        tempCostToCustomer = Double.parseDouble(inputList.get(y + 2).toString());


        Drink mocha =
                new Drink(tempName, tempCostToMake, tempCostToCustomer);
        chaiTea.sold();
        chaiTea.writeEndOfDay();
        y = y + 3;
        tempName = inputList.get(y).toString();
        tempCostToMake = Double.parseDouble(inputList.get(y + 1).toString());
        tempCostToCustomer = Double.parseDouble(inputList.get(y + 2).toString());

    }

    }




