package JUnit.BasicJUnitTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

class PerformanceTestingUsingTimeoutTest {

    @Test
    @Timeout(3)
    public void longRunningTask() throws InterruptedException {
        Thread.sleep(3);
//        assertEquals("Task Completed", ;
    }
}