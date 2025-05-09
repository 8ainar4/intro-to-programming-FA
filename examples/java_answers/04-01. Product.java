public class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double pricePerUnit;

    // Constructor
    public Product(String productId, String productName, int quantity, double pricePerUnit) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    // Getter and Setter methods
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
  
    public double getTotalValue() {
        return quantity * pricePerUnit;
    }
  
    public void displayProduct() {
        System.out.println("Product Name: " + this.getProductName());
        System.out.printf("Total Value: %.2f%n%n", this.getTotalValue());
    }
}

//---------------------------------------------------------------------------------------------------
public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("P001", "Notebook", 50, 15.99);
        Product p2 = new Product("P002", "Pen", 100, 1.25);
        
        p1.displayProduct();
        p2.displayProduct();
    }
}
