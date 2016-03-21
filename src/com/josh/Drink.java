package com.josh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
/**
 * Created by Destro on 3/19/2016.
 */
public class Drink {

    //Data for a Drink class
    String name;
    double costToMake;
    double costToCustomer;
    int amountSold;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostToMake() {
        return costToMake;
    }

    public void setCostToMake(double costToMake) {
        this.costToMake = costToMake;
    }

    public double getCostToCustomer() {
        return costToCustomer;
    }

    public void setCostToCustomer(double costToCustomer) {
        this.costToCustomer = costToCustomer;
    }

    public int getAmountSold() {
        return amountSold;
    }

    public void setAmountSold(int amountSold) {
        this.amountSold = amountSold;
    }


    //Constructor
    Drink(String drinkName, double moneyCostToMake, double moneyCostToCustomer) {
        //System.out.println("display if comes here");    //for testing
        this.name = drinkName;
        this.costToMake = moneyCostToMake;
        this.costToCustomer = moneyCostToCustomer;
        this.sold();        //method to get amount sold



    }

    public void getInfo(ArrayList temp, int y) {  //attempt to get information

        this.name = temp.get(y).toString();
        this.costToMake = Double.parseDouble(temp.get(y + 1).toString());
        this.costToCustomer = Double.parseDouble(temp.get(y + 2).toString());
    }

    public int sold() {       //method for how many sold for the day
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //try {
                System.out.println("How many " + this.name + " were sold today?");
                this.amountSold = scanner.nextInt();
            //} catch (NumberFormatException ie) {
         //       System.out.println("Please enter a whole number");
        return amountSold;
        }
        }


    public void writeEndOfDay() throws IOException{      //write file at end of day

        FileWriter writer = new FileWriter("sales-report.txt", true);
        BufferedWriter bufWriter = new BufferedWriter(writer);
        bufWriter.write(this.name + ": Sold " + amountSold + ", Expenses $" + (this.costToMake*amountSold) + ", Revenue $" + (amountSold*this.costToCustomer) + ", Profit $" + ((
        this.costToCustomer*amountSold) - (this.costToMake*amountSold) + " \n  "));
        bufWriter.close();
    }
}
