package rodriguezgonzalez;

import rodriguezgonzalez.practice1.model.Product;
import rodriguezgonzalez.practice1.model.Supermarket;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Supermarket> supermarkets = createSuperMarkets();
        List<Product> products = createProducts();
        supermarkets.forEach(s -> fillSuperMarket(s, products));
    }

    private static void fillSuperMarket(Supermarket supermarket, List<Product> products) {
        products.forEach(p-> supermarket.put(p, urlOf(supermarket, p)));
    }

    private static String urlOf(Supermarket supermarket, Product product){
        return null;
    }
    private static List<Supermarket> createSuperMarkets() {
        //TODO
        return List.of();
    }
    private static List<Product> createProducts() {
        //TODO fill from tsv
        return List.of();
    }
}