package reflection.advanceLevel;

import java.lang.reflect.*;

class ExampleClass {
    public void methodOne() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void methodTwo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MethodExecutionTiming {
    public static void measureExecutionTime(Object obj, String methodName) throws Exception {
        Method method = obj.getClass().getDeclaredMethod(methodName);
        long startTime = System.nanoTime();
        method.invoke(obj);
        long endTime = System.nanoTime();
        System.out.println("Execution time of " + methodName + ": " + (endTime - startTime) + " nanoseconds");
    }

    public static void main(String[] args) throws Exception {
        ExampleClass example = new ExampleClass();
        measureExecutionTime(example, "methodOne");
        measureExecutionTime(example, "methodTwo");
    }
}
