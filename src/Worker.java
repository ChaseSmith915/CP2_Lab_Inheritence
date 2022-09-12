public class Worker extends Person {
private double hourlyPayRate;

    public Worker(String IDnum, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(IDnum, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        if(hoursWorked > 40)
        {
            double regPay = hourlyPayRate * 40;
            double overPay = (hoursWorked - 40) * hourlyPayRate * 1.5;
            return regPay + overPay;
        }
        else
        {
            return hourlyPayRate * hoursWorked;
        }
    }
    public String displayWeeklyPay(double hoursWorked)
    {
        if(hoursWorked > 40)
        {
            double regHoursWorked = 40;
            double regPay = hourlyPayRate * regHoursWorked;
            double overHoursWorked = hoursWorked - 40;
            double overPay = overHoursWorked * hourlyPayRate * 1.5;
            double totalPay = overPay + regPay;
            double totalHours = overHoursWorked + regHoursWorked;
            String output = new String("A total of " + regHoursWorked + " regular hours were worked, which earned " + regPay + " Dollars. A total of " + overHoursWorked + " overtime hours were worked, which earned " + overPay +  " dollars. The total number of hours worked was " + totalHours + ". The total pay was " + totalPay);
            return output;
        }
        else
        {
            double regHoursWorked = hoursWorked;
            double regPay = hourlyPayRate * regHoursWorked;
            String output = ("a total of " + regHoursWorked + " hours were worked, which earned a total of " + regPay + " dollars. No overtime hours were worked.");
            return output;
        }

    }
}
