/*

 * To change this template, choose Tools | Templates

 * and open the template in the editor.

 */

package com.mycompany.mavenproject2;


/**

 *

 * @author m34lmar

 */

public class Main {

    public static void main(String[] a){
  Movie m1,m3,m5;
        
            m1= new Movie("M1",0);
            m3 = new Movie("M3",1);
            m5 = new Movie("M5",2);

        

        Customer c1 = new Customer("Moi");

        Rental r1 = new Rental(m5, 5);

        c1.addRentals(r1);

        c1.addRentals(new Rental(m1,10));

        c1.addRentals(new Rental(m3,5));
        

        System.out.println(c1.statement());


    }

}