import java.util.ArrayList;
import java.util.Objects;

public class Product {
    static ArrayList<Product> products = new ArrayList<>();

    private int price;
    private double weight;
    private String name;
    private boolean isPurchased;

    public Product(int price, double weight, String name) {
        this.price = price;
        this.weight = weight;
        this.name = name;

    }

    public void add() throws Exception {
        if (!products.contains(this)) {
            blankLine();
            products.add(this);
        } else {
            throw new Exception("Продукт уже есть в списке");
        }
    }

    private void blankLine() throws Exception {
        if ( name == null || name.isBlank()  || weight <= 0 ||
                price <= 0 ){
            throw new Exception ("Заполните карточку товара полностью");
        }
    }

    @Override
    public boolean equals(Object otherObject) {

        Product otherProduct = (Product)otherObject;

        if (this.name.equals(otherProduct.name)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
