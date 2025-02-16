package reflection.advanceLevel;

import java.lang.reflect.Field;

class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ObjectToJson {
    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");
        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            try {
                json.append("\"").append(fields[i].getName()).append("\": \"")
                        .append(fields[i].get(obj)).append("\"");
                if (i < fields.length - 1) {
                    json.append(", ");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) {
        Person1 person = new Person1("John Doe", 30);
        System.out.println(toJson(person));
    }
}
