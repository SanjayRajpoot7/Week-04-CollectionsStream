package annotations.beginnerLevel;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

class Task {
    @ImportantMethod(level = "MEDIUM")
    public void taskOne() {
        System.out.println("Task One");
    }

    @ImportantMethod(level = "HIGH")
    public void taskTwo() {
        System.out.println("Task Two");
    }

    public void taskThree() {
        System.out.println("Task Three");
    }
}

public class AnnotationToMarkImportantMethods {
    public static void main(String[] args) throws Exception {
        Task task = new Task();
        Method[] methods = task.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Importance Level: " + annotation.level());
            }
        }
    }
}
