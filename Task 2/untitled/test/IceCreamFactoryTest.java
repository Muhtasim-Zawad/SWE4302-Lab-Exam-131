import static org.junit.jupiter.api.Assertions.*;

class IceCreamFactoryTest {

    @org.junit.jupiter.api.Test
    void checkFlavor() {
        IceCreamFactory factory = new IceCreamFactory();
        IceCreamFlavor flavor = factory.checkFlavor("Chocolate Fudge");
        assertEquals("Chocolate Fudge", flavor.getName());
    }

    @org.junit.jupiter.api.Test
    void checkTopping() {
        IceCreamFactory factory = new IceCreamFactory();
        IceCreamTopping topping = factory.checkTopping("Sprinkles");
        assertEquals("Sprinkles", topping.getName());
    }
}