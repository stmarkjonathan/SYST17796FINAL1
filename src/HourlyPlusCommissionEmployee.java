public class HourlyPlusCommissionEmployee extends HourlyEmployee{

    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double calculatePay(double bonus){

        //Since we have extended HourlyEmployee, all we have to do is call the superclasses'
        //implementation of calculate pay, and add a bonus. This promotes re-usability.

        //We also rely on getters and setters to ensure HourlyEmployee does not use protected
        //causing it to show sensitive material to anyone in the same package as it.

        int empHours = super.getHours();
        double empWage = super.getWage();

        return super.calculatePay(empHours, empWage) + bonus;



    }


}
