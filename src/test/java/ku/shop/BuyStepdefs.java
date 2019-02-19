package ku.shop;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuyStepdefs {

    private ProductCatalog catalog;
    private Order order;

    @Before
    public void setup() {
        catalog = new ProductCatalog();
        order = new Order();
    }

    @Given("a product (.+) with price (.+) and quantity (.+) exists")
    public void a_product_with_price_exists(String name, double price,int stock) {
        catalog.addProduct(name, price, stock);
    }

    @When("I buy (.+) with quantity (.+)")
    public void i_buy_with_quantity(String name, int quant) {
        Product prod = catalog.getProduct(name);
        order.addItem(prod, quant);
    }

    @Then("total of (.+) should be (.+) and (.+)")
    public void total_should_be(String name,double total, int quant) {
        assertEquals(total, order.getTotal());
        assertEquals(quant, catalog.getProduct(name).getStock());

    }
}