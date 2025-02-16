package annotations.intermediateLevel;
import java.lang.annotation.*;
import java.lang.reflect.*;



@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}

class PerformanceTest {

    @LogExecutionTime
    public void taskOne() {
        try {
            Thread.sleep(100);  // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @LogExecutionTime
    public void taskTwo() {
        try {
            Thread.sleep(200);  // Simulate more work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void taskThree() {
        System.out.println("This method does not have the LogExecutionTime annotation.");
    }
}

public class LoggingMethodExecutionTime {
    public static void main(String[] args) throws Exception {
        PerformanceTest performanceTest = new PerformanceTest();
        Method[] methods = performanceTest.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(performanceTest);
                long endTime = System.nanoTime();
                long duration = endTime - startTime;
                System.out.println("Execution time of method " + method.getName() + ": " + duration + " nanoseconds");
            }
        }
    }
}
