package dip.lab1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {
    
    private double hourlyRate;
    private double totalHrsForYear;
    
    /** default constructor. Is this the best way to go? */
    public HourlyEmployee() {
        
    }

    /**
     * Convenience constructor. Is this the best way to go?
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    private void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;//should be validated
    }

    private void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;//should be validated
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getAnnualWages(){
        return hourlyRate * totalHrsForYear;
    }

}
