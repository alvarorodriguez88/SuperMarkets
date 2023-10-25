package rodriguezgonzalez.practice1.model;

import java.util.HashMap;
import java.util.Map;

public class Supermarket {
    private final String name;
    private final String url;
    private final Map<Product, Float> prices;
    private final Map<Product, String> productUrls;

    public Supermarket(String name, String url) {
        this.name = name;
        this.url = url;
        this.prices = new HashMap<>();
        this.productUrls = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public void put(Product p, String url){
        productUrls.put(p, url);

    }

}
