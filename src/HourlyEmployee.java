public class HourlyEmployee {

    private int hours;
    private double wage;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(int hours) {
        this.hours = hours;
    }

    public double calculatePay(int hours, double wage){

        return hours * wage;

    }

}
