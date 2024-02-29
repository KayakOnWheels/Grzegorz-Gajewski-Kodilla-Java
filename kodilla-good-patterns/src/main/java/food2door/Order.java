package food2door;

import java.util.Date;
import java.util.List;

public class Order {
    private Vendor vendor;
    private List<Product> product;
    private Double quantity;
    private Date deliveryDate;

    public Order(Vendor vendor, List<Product> product, Double quantity, Date deliveryDate) {
        this.vendor = vendor;
        this.product = product;
        this.quantity = quantity;
        this.deliveryDate = deliveryDate;
    }

    public Vendor getVendor() {
        return vendor;
    }
}
