package food2door;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CorporateVendor extends Vendor {

    private Integer nip;

    public CorporateVendor(String name, List<Product> productsInOffer, Integer nip) {
        super(name, productsInOffer);
        this.nip = nip;
    }

    public void prepareOrder() {
        List<Product> productsToOrder =  List.of(getProductsInOffer().get(0), getProductsInOffer().get(1));
        Order order = new Order(this, productsToOrder, 5.0, new Date(2024, 5, 5));

        System.out.println("Some specific info for corporateVendor");
    }
}
