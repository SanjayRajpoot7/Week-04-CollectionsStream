package SmartWarehouseManagementSystem;

public class Groceries extends WarehouseItem {
    private String expirationDate;

    public Groceries(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Expiration Date: " + expirationDate;
    }
}

