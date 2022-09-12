import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    private SalaryWorker w1, w2;

    @BeforeEach
    void setUp() {
        w1 = new SalaryWorker("000001", "Jakota", "Smith", "Mr.", 1940, 19, 26000);
        w2 = new SalaryWorker("000002", "Jase", "Smiv", "Mr.", 1960, 20, 26624);
    }

    @Test
    void setAnnualSalary() {
        w1.setAnnualSalary(24000);
        assertEquals(24000, w1.getAnnualSalary());
    }

    @Test
    void calculateWeeklySalary() {
        assertEquals(512.00, w2.calculateWeeklySalary(0));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("The weekly salary is " + 500.00 + " Which is the annual salary " + 26000.00 + " Divided by 52 ", w1.displayWeeklyPay(0));
    }
}