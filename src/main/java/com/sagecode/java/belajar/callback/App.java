package com.sagecode.java.belajar.callback;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        Measurer meas = new ObjectMeasurer();
        ArrayList <Object> ba = new ArrayList<Object>();
         ba.add(new BankAccount("Andi",6000));
         ba.add(new BankAccount("Andi2",7000));
        
        ArrayList <Object> co = new ArrayList<Object>();
         co.add(new Country("Alaska",1740500));
         co.add(new Country("Nevada",60859));
        
        double averageBalance  = Data.average(ba, meas);
        System.out.println("The average of the balance : "+averageBalance);
        
        double averageArea  = Data.average(co, meas);
        System.out.println("The average of the area : "+averageArea);
    }
}
