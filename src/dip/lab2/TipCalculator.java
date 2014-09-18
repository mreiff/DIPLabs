/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2;

/**
 *
 * @author mreiff
 */
public interface TipCalculator {
    
    public static final double MIN_BILL = 0.00;
    public  static final double MAX_BILL = 1000.00;
    public static final String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    public static final double GOOD_RATE = 0.20;
    public static final double FAIR_RATE = 0.15;
    public static final double POOR_RATE = 0.10;
    
    public abstract double getTip();
    public abstract ServiceQuality getServiceQuality();
    public abstract void setServiceRating(ServiceQuality q);
    
}
