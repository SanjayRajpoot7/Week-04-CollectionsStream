package JUnit.BasicJUnitTest.AdvancePracticeProblems;


public class DatabaseConnection {

    private boolean connected;

    // Method to simulate connecting to the database
    public void connect() {
        connected = true;
        System.out.println("Database connected");
    }

    // Method to simulate disconnecting from the database
    public void disconnect() {
        connected = false;
        System.out.println("Database disconnected");
    }

    // Method to check if the database is connected
    public boolean isConnected() {
        return connected;
    }

    // Main method for simulating the connection and disconnection process
    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();

        // Connect to the database
        dbConnection.connect();

        // Check if the connection is successful
        if (dbConnection.isConnected()) {
            System.out.println("Database connection is successful.");
        }

        // Disconnect from the database
        dbConnection.disconnect();

        // Check if the disconnection is successful
        if (!dbConnection.isConnected()) {
            System.out.println("Database connection is closed.");
        }
    }
}

