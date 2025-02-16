package annotations.advancedLevel;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;


    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    @interface JsonField {
        String name();
    }

    class User {
        @JsonField(name = "user_name")
        private String username;

        @JsonField(name = "user_age")
        private int age;

        public User(String username, int age) {
            this.username = username;
            this.age = age;
        }
    }

public class CustomSerializationAnnotation {
        public static String toJson(Object obj) throws IllegalAccessException {
            Class<?> objClass = obj.getClass();
            Field[] fields = objClass.getDeclaredFields();
            Map<String, Object> jsonMap = new HashMap<>();

            for (Field field : fields) {
                if (field.isAnnotationPresent(JsonField.class)) {
                    JsonField annotation = field.getAnnotation(JsonField.class);
                    field.setAccessible(true);
                    jsonMap.put(annotation.name(), field.get(obj));
                }
            }

            StringBuilder jsonString = new StringBuilder("{");
            for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
                jsonString.append("\"").append(entry.getKey()).append("\": \"")
                        .append(entry.getValue()).append("\", ");
            }

            if (!jsonMap.isEmpty()) {
                jsonString.setLength(jsonString.length() - 2);
            }
            jsonString.append("}");
            return jsonString.toString();
        }

        public static void main(String[] args) throws IllegalAccessException {
            User user = new User("JohnDoe", 25);
            System.out.println(toJson(user));
        }
    }

