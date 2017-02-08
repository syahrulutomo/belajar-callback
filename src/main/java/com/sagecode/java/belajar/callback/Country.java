/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sagecode.java.belajar.callback;

/**
 * Describe a country with its area
 * 
 */
public class Country {
    private double area;
    private String name;
    
    /**
     * Construct a Country from its area and name
     * @param aArea the country's area
     * @param aName the country's name
     */
    public Country(String aName,double aArea)
    {
        name = aName;
        area = aArea;
    }
    
    /**
     * Get the measured country's area
     * @return area of the country
     */
    public double getArea()
    {
        return area;
    }

    /**
     * Get the measured country's name
     * @return name of the country
     */
    public String getName() 
    {
       return name;
    }
}
