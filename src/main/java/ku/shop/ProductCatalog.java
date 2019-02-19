package ku.shop;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {

    private Map<String, Product> products;
    private int stock;

    public ProductCatalog() {
        products = new HashMap<>();
    }

    public void addProduct(String name, double price, int stock) {
        this.stock = stock;
        products.put(name, new Product(name, price, stock));
    }

    public Product getProduct(String name) {
        return products.get(name);
    }
    public int getStock() {return stock;}
}
