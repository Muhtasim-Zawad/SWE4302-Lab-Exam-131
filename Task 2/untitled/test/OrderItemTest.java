import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderItemTest {

    @Test
    void calculateItemPrice() {
        IceCreamFactory factory = new IceCreamFactory();
        OrderItem item = factory.createOrderItem("Chocolate Fudge", 1, "Chocolate Chips", 1);;
        double price = item.calculateItemPrice();
        assertEquals(3.50, price);
    }

}