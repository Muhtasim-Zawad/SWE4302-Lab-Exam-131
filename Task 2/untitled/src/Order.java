import java.util.ArrayList;
import java.util.List;

public class Order {
        private final List<OrderItem> items = new ArrayList<>();
        private final String container;
        private final double containerPrice;
        private static final double TAX_RATE = 0.08;
        private static final double WAFFLE_CONE_PRICE = 5.00;
        private static final double PAPER_CUP_PRICE = 0.00;

        public Order(String container) {
            this.container = container.toLowerCase();
            this.containerPrice = container.equals("waffle cone") ? WAFFLE_CONE_PRICE : PAPER_CUP_PRICE;
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
