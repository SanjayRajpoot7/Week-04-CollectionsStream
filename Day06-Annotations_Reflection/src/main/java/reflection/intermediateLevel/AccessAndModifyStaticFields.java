package reflection.intermediateLevel;
import java.lang.reflect.Field;

public class AccessAndModifyStaticFields {

    public static void main(String[] args) {
        try {
            Class<?> configClass = Configuration.class;
            Field apiKeyField = configClass.getDeclaredField("API_KEY");
            apiKeyField.setAccessible(true);
            System.out.println("Before modification:");
            Configuration.printAPIKey();

            apiKeyField.set(null, "67890-newapikey");

            System.out.println("\nAfter modification:");
            Configuration.printAPIKey();

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}



class Configuration {

    // Private static field
    private static String API_KEY = "12345-abcdef";

    // Method to print the current API_KEY value
    public static void printAPIKey() {
        System.out.println("Current API Key: " + API_KEY);
    }
}

