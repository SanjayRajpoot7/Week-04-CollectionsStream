package SmartWarehouseManagementSystem;

import java.util.List;

public class Warehouse {

    // Method to display all items using wildcard
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // Create storage for different item types
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Add items to storage
        electronicsStorage.addItem(new Electronics("Laptop", 44000, "Dell"));
        electronicsStorage.addItem(new Electronics("Smartphone", 8700, "Samsung"));

        groceriesStorage.addItem(new Groceries("Apple", 57000, "2025-12-31"));
        groceriesStorage.addItem(new Groceries("Milk", 60, "2025-01-31"));

        furnitureStorage.addItem(new Furniture("Chair", 700, "Wood"));
        furnitureStorage.addItem(new Furniture("Table", 400, "Metal"));

        // Display all items in storage using wildcard
        System.out.println("Electronics Storage:");
        displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Storage:");
        displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture Storage:");
        displayItems(furnitureStorage.getItems());
    }
}

