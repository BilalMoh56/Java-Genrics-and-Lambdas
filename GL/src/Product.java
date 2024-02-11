

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Inventory<Product>
        Inventory<Product> myInventory = new Inventory();

        // Add Product objects to the inventory
        myInventory.addItem(new Product("Product1", 10.0));
        myInventory.addItem(new Product("Product2", 20.0));
        myInventory.addItem(new Product("Product3", 30.0));

        // Calculate the total price of all products
        double priceTotal = myInventory.getItems().stream()
                .mapToDouble(product -> product.getPrice())
                .sum();

        // Print the total price to the console
        System.out.println("Total Price of Products: $" + priceTotal);
    }
}