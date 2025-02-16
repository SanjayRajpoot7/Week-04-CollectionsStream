package reflection.advanceLevel;

import java.lang.reflect.*;
import java.util.Map;

class Person {
    private String name;
    private int age;

    // Getter methods for demonstration
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class CustomObjectMapper {

    // Method to convert a Map to an object of a given class
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create a new instance of the class
            T obj = clazz.getDeclaredConstructor().newInstance();

            // Iterate over each entry in the map
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                // Get the field name and value from the map
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                // Get the field in the class using reflection
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);  // Make private fields accessible

                // Set the field value
                field.set(obj, fieldValue);
            }

            return obj;

        } catch (NoSuchFieldException | IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        // Create a map with field names as keys and field values as values
        Map<String, Object> properties = Map.of(
                "name", "John Doe",
                "age", 30
        );

        // Use the toObject method to convert the map to a Person object
        Person person = toObject(Person.class, properties);

        // Print the person object
        System.out.println(person); // Output: Person{name='John Doe', age=30}
    }
}
