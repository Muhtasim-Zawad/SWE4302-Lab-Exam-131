import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IceCreamFactory factory = new IceCreamFactory();


        Order order = new Order("waffle cone");


        order.addItem(factory.createOrderItem("Chocolate Fudge", 1, "Chocolate Chips", 1));
        order.addItem(factory.createOrderItem("Mint Chocolate Chip", 1, "Fresh Strawberries", 2));


        System.out.println("Subtotal: $" + order.calculateSubtotal());
        System.out.println("Tax: $" + order.calculateTax());
        System.out.println("Total: $" + order.calculateTotal());

        // Generate invoice
        InvoiceGenerator.generateInvoice(order, "invoice.txt");
    }
}
