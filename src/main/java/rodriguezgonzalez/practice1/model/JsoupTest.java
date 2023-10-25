package rodriguezgonzalez.practice1.model;

import org.jsoup.Jsoup;


import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;


import java.io.IOException;


public class JsoupTest {
    public static void main(String[] args) throws IOException{
        Document doc = Jsoup.connect("https://www.compraonline.alcampo.es/products/AZUCARERA-Az%C3%BAcar-moreno-AZUCARERA-800-gr/12570").get();
        //System.out.println(doc.title());

        Elements priceElements = doc.select(".buybox__prices .buybox__price");
        Elements titleElement = doc.select(".product-header__name");
        for (Element priceElement : priceElements) {
            String price = priceElement.text();
            String title = titleElement.text();
            System.out.println("Precio: " + price + "\nProducto: " + title);
        }
    }
}

