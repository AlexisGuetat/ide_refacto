/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author nicol
 */
// Movie is just a simple data class
public class Movie {

    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;
    private final java.lang.String title;
    private int priceCode;
    
    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public int getPriceCode() {
        return this.priceCode;
    }

    public void setPriceCode(int newCode) {
        this.priceCode = newCode;
    }
}
