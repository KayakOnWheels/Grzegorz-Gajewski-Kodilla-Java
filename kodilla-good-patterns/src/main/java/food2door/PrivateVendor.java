package food2door;

import java.util.Date;
import java.util.List;

public class PrivateVendor extends Vendor {

    public PrivateVendor( String name, List<Product> productsInOffer) {
        super(name, productsInOffer);
    }

    public void prepareOrder() {
        List<Product> productsToOrder =  List.of(getProductsInOffer().get(0));
        Order order = new Order(this, productsToOrder, 5, new Date(2024, 5, 5));
        System.out.println("Nothing fancy for this vendor");
    }
}
