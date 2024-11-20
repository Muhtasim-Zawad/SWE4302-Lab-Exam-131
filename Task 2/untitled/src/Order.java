import java.util.ArrayList;
import java.util.List;

public class Order {
        private final List<OrderItem> items = new ArrayList<>();
        private final String container;
        private final double containerPrice;
        private static final double TAX_RATE = 0.08;

        public Order(String container) {
            this.container = container.toLowerCase();
            this.containerPrice = container.equals("waffle cone") ? 5.00 : 0.00;
        }

        public void addItem(OrderItem item) {
            items.add(item);
        }

        public double calculateSubtotal() {
            double subtotal = containerPrice;
            for (OrderItem item : items) {
                subtotal += item.calculateItemPrice();
            }
            return subtotal;
        }

        public double calculateTax() {
            return calculateSubtotal() * TAX_RATE;
        }

        public double calculateTotal() {
            return calculateSubtotal() + calculateTax();
        }

        public List<OrderItem> getItems() {
            return items;
        }

        public String getContainer() {
            return container;
        }

        public double getContainerPrice() {
            return containerPrice;
        }
}
