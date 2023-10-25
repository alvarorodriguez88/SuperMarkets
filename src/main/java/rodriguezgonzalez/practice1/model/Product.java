package rodriguezgonzalez.practice1.model;

public class Product {
    private final String name;
    private final String barCode;

    public Product(String name, String barCode) {
        this.name = name;
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public String getBarCode() {
        return barCode;
    }
}
