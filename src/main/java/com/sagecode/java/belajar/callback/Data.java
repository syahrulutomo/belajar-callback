/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagecode.java.belajar.callback;

import java.util.ArrayList;

public class Data {
    /**
     *  Computes the average of the measures of the given objects.
     *  @param objects an array of objects
     *  @param meas the measurer for the objects
     *  @return the average of the measures
     */   
    public static double average(ArrayList<Object> objects, Measurer meas)
    {
        double sum = 0;
        for (Object obj : objects)
        {
            sum = sum + meas.measure(obj);
        }
        if (objects.size() > 0) 
        { 
            return sum / objects.size(); 
        }
        else 
        { 
            return 0; 
        } 
    }   
    
    
}
