package annotations.beginnerLevel;
import java.lang.annotation.*;
import java.lang.reflect.*;


    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface Todo {
        String task();
        String assignedTo();
        String priority() default "MEDIUM";
    }

    class Project {
        @Todo(task = "Implement user login", assignedTo = "John", priority = "HIGH")
        public void taskOne() {
            System.out.println("Task One: Implement user login");
        }

        @Todo(task = "Design database schema", assignedTo = "Alice", priority = "MEDIUM")
        public void taskTwo() {
            System.out.println("Task Two: Design database schema");
        }

        @Todo(task = "Write API documentation", assignedTo = "Bob", priority = "LOW")
        public void taskThree() {
            System.out.println("Task Three: Write API documentation");
        }

        public void taskFour() {
            System.out.println("Task Four: Completed tasks are not annotated.");
        }
    }

public class ToDoTaskForPendingTask {
        public static void main(String[] args) throws Exception {
            Project project = new Project();
            Method[] methods = project.getClass().getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Todo.class)) {
                    Todo annotation = method.getAnnotation(Todo.class);
                    System.out.println("Task: " + annotation.task());
                    System.out.println("Assigned To: " + annotation.assignedTo());
                    System.out.println("Priority: " + annotation.priority());
                    System.out.println();
                }
            }
        }
}
