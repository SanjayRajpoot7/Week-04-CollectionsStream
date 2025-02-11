package DynamicOnlineMarketplace;
public class Marketplace {

    // Generic method to apply discount
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        double newPrice = product.getPrice() - discountAmount;
        product.setPrice(newPrice);
    }

    public static void main(String[] args) {
        // Create product instances with their respective categories
        Product<BookCategory> book = new Product<>("Java Programming", 29.99, new BookCategory());
        Product<ClothingCategory> clothing = new Product<>("T-shirt", 19.99, new ClothingCategory());
        Product<GadgetCategory> gadget = new Product<>("Smartphone", 599.99, new GadgetCategory());

        // Display products before applying discounts
        System.out.println("Before Discount:");
        System.out.println(book);
        System.out.println(clothing);
        System.out.println(gadget);

        // Apply discounts to products
        applyDiscount(book, 10);  // 10% discount on book
        applyDiscount(clothing, 15);  // 15% discount on clothing
        applyDiscount(gadget, 5);  // 5% discount on gadget

        // Display products after applying discounts
        System.out.println("\nAfter Discount:");
        System.out.println(book);
        System.out.println(clothing);
        System.out.println(gadget);
    }
}

