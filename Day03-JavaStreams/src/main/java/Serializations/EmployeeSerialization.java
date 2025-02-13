package Serializations;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", department='" + department + '\'' +
                ", salary=" + salary + '}';
    }
}

public class EmployeeSerialization {

    public static void serializeEmployees(List<Employee> employees, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(employees);
            System.out.println("Employees have been serialized and saved to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to deserialize the list of employees from a file
    public static List<Employee> deserializeEmployees(String filePath) {
        List<Employee> employees = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            employees = (List<Employee>) ois.readObject(); // Deserialize the list of employees
            System.out.println("Employees have been deserialized from the file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public static void main(String[] args) {
        String filePath = "D:\\capgeminiTraining\\week-04-collections,streams\\Day03-JavaStreams\\src\\main\\java\\Serializations\\File.txt";


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Raj", "IT", 55000));
        employees.add(new Employee(2, "Jitesh", "HR", 75000));
        employees.add(new Employee(3, "Sumit", "Finance", 78000));

        serializeEmployees(employees, filePath);

        List<Employee> deserializedEmployees = deserializeEmployees(filePath);

        if (deserializedEmployees != null) {
            for (Employee employee : deserializedEmployees) {
                System.out.println(employee);
            }
        }
    }
}
