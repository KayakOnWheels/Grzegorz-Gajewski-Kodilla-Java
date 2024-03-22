package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
         //Given
        Product p1 = new Product("Bateria AA");
        Product p2 = new Product("Akumulator 12V");
        Product p3 = new Product("Walkman");

        productDao.save(p1);
        productDao.save(p2);
        productDao.save(p3);

        Item item1 = new Item(p1, new BigDecimal(2), 5, new BigDecimal(10));
        Item item2 = new Item(p2, new BigDecimal(150), 1, new BigDecimal(150));

        //item1.setProduct(p1);
        //item2.setProduct(p2);

        Invoice invoice = new Invoice("1-1-1");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);


        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

        //CleanUp
/*        try {
            invoiceDao.deleteById(invoiceId);
        } catch (Exception e) {
            //do nothing
        }*/
    }
}
