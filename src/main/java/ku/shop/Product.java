package ku.shop;

public class Product {
    private double price;
    private String name;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStock(){return stock;}

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("Price must be not be negative zero");
        this.price = price;
    }

    public int setStock(int quant){
        return stock -= quant;
    }
}
