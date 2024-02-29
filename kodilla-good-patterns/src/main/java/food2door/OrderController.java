package food2door;

public class OrderController {

    public static void sendOrder(Order order) {
        MailService mailService = new MailService();
        mailService.sendEmail(order.getVendor());
    }

    public static void cancelOrder(Order order) {
        MailService mailService = new MailService();
        mailService.sendEmail(order.getVendor());
    }

    public static void updateOrder(Order order) {
        MailService mailService = new MailService();
        mailService.sendEmail(order.getVendor());
    }

}
