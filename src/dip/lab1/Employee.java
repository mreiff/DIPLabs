/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab1;

/**
 *
 * @author mreiff
 */
public interface Employee {
    
    public static enum WageType {
        SALARIED,
        HOURLY
    }
    
    public abstract double getAnnualWages();
    
}
