package com.josh;

/**
 * Created by Destro on 3/19/2016.
 */
public class Drink {

    //Data for a Drink class
    String name;
    double costToMake;
    double costToCustomer;


    //Constructor
    Drink(String drinkName, double moneyCostToMake, double moneyCostToCustomer) {
        this.name = drinkName;
        this.costToMake = moneyCostToMake;
        this.costToCustomer = moneyCostToCustomer;
    }

}
