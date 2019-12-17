/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author nicol
 */
public class Customer {

    private final java.lang.String name;
    private final Vector rentals;

    public Customer(String name) {
        this.name = name;
        this.rentals = new Vector();
    }

    public void addRentals(Rental arg) {
        this.rentals.addElement(arg);
    }



    public java.lang.String getName() {
        return this.name;
    }
    
    public String statement() {
        
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration enuRentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (enuRentals.hasMoreElements()) {
            Rental each = (Rental) enuRentals.nextElement();
            double thisAmount = each.amoutFor();
            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE) {
                frequentRenterPoints++;
            }

            // show figures for this rental
            result += "\t" + each.getMovie().getTitle()
                    + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        
        // add footer lines
        result += "Amount owed is "
                + String.valueOf(totalAmount)
                + "\n";
        result += "You earned "
                + String.valueOf(frequentRenterPoints)
                + "frequent renter points ";
        return result;
    }
}
