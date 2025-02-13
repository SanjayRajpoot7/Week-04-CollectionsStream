package Map_Interface;
import java.util.*;

class Employee {
    String name;
    Department department;

    // Constructor
    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

enum Department {
    HR, IT, SALES, MARKETING
}

public class GroupObjectsByProperty {

    // Method to group employees by department
    public static Map<Department, List<Employee>> groupByDepartment(List<Employee> employees) {
        // Create a map to group employees by department
        Map<Department, List<Employee>> departmentMap = new HashMap<>();

        // Iterate over the employees list
        for (Employee employee : employees) {
            // Get the department of the employee
            Department department = employee.department;

            // If department is not already in the map, add it with a new list
            departmentMap.computeIfAbsent(department, k -> new ArrayList<>()).add(employee);
        }

        return departmentMap;
    }

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", Department.HR));
        employees.add(new Employee("Bob", Department.IT));
        employees.add(new Employee("Carol", Department.HR));

        // Group employees by department
        Map<Department, List<Employee>> groupedEmployees = groupByDepartment(employees);

        // Print the grouped employees
        for (Map.Entry<Department, List<Employee>> entry : groupedEmployees.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
