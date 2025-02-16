package annotations.intermediateLevel;
import java.lang.annotation.*;
import java.lang.reflect.*;



    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    @interface MaxLength {
        int value();
    }

    class User {
        @MaxLength(10)
        private String username;

        public User(String username) {
            Field[] fields = this.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(MaxLength.class)) {
                    MaxLength annotation = field.getAnnotation(MaxLength.class);
                    if (username.length() > annotation.value()) {
                        throw new IllegalArgumentException("Username exceeds the maximum length of " + annotation.value());
                    }
                }
            }
            this.username = username;
        }

        public String getUsername() {
            return username;
        }
    }

public class FieldValidation {
        public static void main(String[] args) {
            try {
                User user = new User("ThisIsAReallyLongUsername");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

