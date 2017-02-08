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
     *  @param anObject an object
     *  @return value from the called object
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
