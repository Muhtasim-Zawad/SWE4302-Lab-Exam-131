import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void calculateSubtotal() {
        IceCreamFactory factory = new IceCreamFactory();
        Order order = new Order("waffle cone");

        order.addItem(factory.createOrderItem("Chocolate Fudge", 1, "Chocolate Chips", 1));
        assertEquals(8.50, order.calculateSubtotal());
    }

    @Test
    void getContainerPrice() {
        Order order = new Order("waffle cone");
        double price = order.getContainerPrice();
        assertEquals(5.00, price);
    }

    @Test
    void getContainerPrice2() {
        Order order = new Order("paper cup");
        double price = order.getContainerPrice();
        assertEquals(0.00, price);
    }
}