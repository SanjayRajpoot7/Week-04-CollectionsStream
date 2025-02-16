package annotations.advancedLevel;
import java.lang.annotation.*;
import java.lang.reflect.*;


    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface RoleAllowed {
        String value();
    }

    class UserAccess {
        private String role;

        public UserAccess(String role) {
            this.role = role;
        }

        public String getRole() {
            return role;
        }

        @RoleAllowed("ADMIN")
        public void adminMethod() {
            System.out.println("Access granted to ADMIN method.");
        }

        public void validateAccess(Method method) {
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed annotation = method.getAnnotation(RoleAllowed.class);
                if (!annotation.value().equals(this.getRole())) {
                    System.out.println("Access Denied!");
                } else {
                    try {
                        method.invoke(this);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

public class RoleBasedAccessControl {
        public static void main(String[] args) throws Exception {
            UserAccess userAccess = new UserAccess("USER");
            Method method = userAccess.getClass().getMethod("adminMethod");
            userAccess.validateAccess(method);

            UserAccess adminAccess = new UserAccess("ADMIN");
            userAccess = adminAccess;
            userAccess.validateAccess(method);
        }
    }

