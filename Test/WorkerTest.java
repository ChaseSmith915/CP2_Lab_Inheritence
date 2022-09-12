import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    private Worker w1, w2;

    @BeforeEach
    void setUp() {
        w1 = new Worker("000001", "John", "Doe", "Mr.", 2000, 21);
        w2 = new Worker("000002", "Samantha", "Adams", "Mrs.", 1998, 24);

    }

    @Test
    void calculateWeeklyPay()
    {
        assertEquals(996.0,w2.calculateWeeklyPay(41));
    }

    @Test
    void displayWeeklyPay()
    {
        assertEquals("a total of " + 40.0 + " hours were worked, which earned a total of " + 960.0 + " dollars. No overtime hours were worked.", w2.displayWeeklyPay(40));
        assertEquals("A total of 40.0 regular hours were worked, which earned 840.0 Dollars. A total of 2.0 overtime hours were worked, which earned 63.0 dollars. The total number of hours worked was 42.0. The total pay was 903.0", w1.displayWeeklyPay(42));

    }

    @Test
    void setHourlyPayRate()
    {
        w1.setHourlyPayRate(24);
        assertEquals(24, w1.getHourlyPayRate());
    }

}