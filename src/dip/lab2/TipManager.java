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
public class TipManager implements TipCalculator{
    
    private TipCalculator calculator;
    
    public TipManager(){
    }

    public void createBaggageServiceCalculator(ServiceQuality q, int bags){
        calculator = new BaggageServiceTipCalculator(q, bags);
    }
    
    public void createFoodServiceCalculator(ServiceQuality q, double billAmt){
        calculator = new FoodServiceTipCalculator(q, billAmt);
    }
    
    @Override
    public double getTip() {
        return calculator.getTip();
    }

    @Override
    public ServiceQuality getServiceQuality() {
        return calculator.getServiceQuality();
    }

    @Override
    public void setServiceRating(ServiceQuality q) {
        calculator.setServiceRating(q);
    }
/*
    public TipCalculator getCalculator() {
        return calculator;
    }

    public void setCalculator(TipCalculator calculator) {
        this.calculator = calculator;
    }
    Made these just incase they are needed. Commented because I am unsure of this
    and it doesn't damage my code without it.*/
    
    
    
}
