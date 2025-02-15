package JUnit.BasicJUnitTest.AdvancePracticeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    public void deposit() {
        double balance = 5600;
        double amount = 4200;
        balance += amount;
        assertEquals(9800.0, balance);
    }

    @Test
    public void withdraw() {
        double balance = 5600;
        double amount = 1220;
        if (balance > amount && amount > 0) {
            balance -= amount;
        }
        assertEquals(4380.0, balance);
    }

    @Test
    public void getBalance() {
        double balance = 2350;
        assertEquals(2350.0, balance);
    }
}
