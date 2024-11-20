import java.io.FileWriter;
import java.io.IOException;

public class InvoiceGenerator {
    public static void generateInvoice(Order order, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Ice Cream Shop Invoice\n");
            writer.write("=======================\n");

            for (OrderItem item : order.getItems()) {
                writer.write(item.getDetails());
            }

            writer.write("Subtotal: $" + order.calculateSubtotal() + "\n");
            writer.write("Tax: $" + order.calculateTax() + "\n");
            writer.write("Total Amount Due: $" + order.calculateTotal() + "\n");

            System.out.println("Invoice saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
