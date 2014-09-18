package dip.lab1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements Employee {
    
    private double annualSalary;
    private double annualBonus;
    
    /** default constructor. Is this the best way to go? */
    public SalariedEmployee() {
        
    }

    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    private void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;//should be validated
    }

    private void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;//should be validated
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getAnnualWages() {
        return annualSalary + annualBonus;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }
    
}
