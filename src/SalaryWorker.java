
public class SalaryWorker extends Worker{
    private double annualSalary;

    public SalaryWorker(String IDnum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(IDnum, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double calculateWeeklySalary(double hoursWorked)
    {
        return annualSalary / 52;
    }

    public String displayWeeklyPay(double hoursWorked)
    {
        double weeklySalary = calculateWeeklySalary(hoursWorked);
        String weeklySalaryRound = String.format("%.2f", weeklySalary);
        return "The weekly salary is " + weeklySalaryRound + " Which is the annual salary " + annualSalary+ " Divided by 52 ";
    }

}
