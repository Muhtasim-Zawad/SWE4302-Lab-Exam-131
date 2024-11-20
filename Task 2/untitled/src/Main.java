import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*List<IceCreamFlavor> flavors = Arrays.asList(
                new IceCreamFlavor("Mint Chocolate Chip", 2.80),
                new IceCreamFlavor("Chocolate Fudge", 3.00),
                new IceCreamFlavor("Strawberry Swirl", 2.75),
                new IceCreamFlavor("Pistachio Delight", 3.25)
        );

        List<IceCreamTopping> toppings = Arrays.asList(
                new IceCreamTopping("Sprinkles", 0.30),
                new IceCreamTopping("Marshmallow", 0.70),
                new IceCreamTopping("Crushed Oreo", 0.85),
                new IceCreamTopping("Fresh Strawberries", 1.00),
                new IceCreamTopping("Chocolate Chips", 0.50)
        );*/


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
