package food2door;

import java.util.ArrayList;
import java.util.List;

public abstract class Vendor {

    private String name;
    private List<Product> productsInOffer;

    public Vendor(String name, List<Product> productsInOffer) {
        this.name = name;
        this.productsInOffer = productsInOffer;
    }

    public List<Product> getProductsInOffer() {
        return productsInOffer;
    }

    public abstract void prepareOrder();
}
