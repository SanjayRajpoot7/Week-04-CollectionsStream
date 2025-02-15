package JUnit.BasicJUnitt;

public class PerformanceTestingUsingTimeout {

    public static String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Task Completed";
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(longRunningTask());
    }
}
