/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagecode.java.belajar.callback;

/**
 *
 * @author syahrul
 */
public class ObjectMeasurer implements Measurer{

    /**
     *  Computes the average of the measures of the given objects.
     *  @param objects an array of objects
     *  @param meas the measurer for the objects
     *  @return the average of the measures
     */
    public double measure(Object anObject) 
    {
        double amount = 0;
        
        if(anObject instanceof BankAccount)
        {
            BankAccount ba = (BankAccount) anObject;
            amount =  ba.getBalance();
        } else if(anObject instanceof Country)
        {
            Country co = (Country) anObject;
            amount = co.getArea();
        }       
        return amount;
    }
    
}
