import java.util.ArrayList;

public class InheritanceDemo {

        public static void main(String[] args)
        {
                Worker worker1 = new Worker("000001", "John", "Brown", "Mr.", 1998, 25.00);
                Worker worker2 = new Worker("000002", "Sally", "Baker", "Mrs", 2000, 18.50);
                Worker worker3 = new Worker("000003", "Steven", "Newman","Mr", 2002, 16.50);
                SalaryWorker worker4 = new SalaryWorker("000004", "Samantha", "Smith", "Mrs.", 1994, 0, 100000);
                SalaryWorker worker5 = new SalaryWorker("000005", "Macy", "Beckman","Ms.", 1997, 0, 90000);
                SalaryWorker worker6 = new SalaryWorker("000006", "Evan", "Davis", "Mr.", 1990, 0, 110000);

                ArrayList<Worker> workerList = new ArrayList<Worker>();
                workerList.add(worker1);
                workerList.add(worker2);
                workerList.add(worker3);
                workerList.add(worker4);
                workerList.add(worker5);
                workerList.add(worker6);

                for(int w = 1; w <= 3; w++)
                {
                        if(w == 2)
                        {
                                for(Worker work : workerList)
                                {
                                        System.out.println("Week 2 " + work.getFirstName() + ": " + work.displayWeeklyPay(50));
                                }
                                System.out.println("\n");
                        }
                        else
                        {
                                for(Worker work : workerList)
                                {

                                        System.out.println("Week " + w + " " + work.getFirstName() + ": " + work.displayWeeklyPay(40));
                                }
                                System.out.println("\n");
                        }
                }
        }
}
