import java.util.List;
import java.util.Arrays;

public class IceCreamFactory {
    private final List<IceCreamFlavor> availableFlavors = Arrays.asList(
                new IceCreamFlavor("Mint Chocolate Chip", 2.80),
                new IceCreamFlavor("Chocolate Fudge", 3.00),
                new IceCreamFlavor("Strawberry Swirl", 2.75),
                new IceCreamFlavor("Pistachio Delight", 3.25)
        );

    private final List<IceCreamTopping> availableToppings = Arrays.asList(
                new IceCreamTopping("Sprinkles", 0.30),
                new IceCreamTopping("Marshmallow", 0.70),
                new IceCreamTopping("Crushed Oreo", 0.85),
                new IceCreamTopping("Fresh Strawberries", 1.00),
                new IceCreamTopping("Chocolate Chips", 0.50)
        );
    public IceCreamFactory() {
    }

    public IceCreamFlavor checkFlavor(String name) {
        for (IceCreamFlavor flavor : availableFlavors) {
            if (flavor.getName().equalsIgnoreCase(name)) {
                return flavor;
            }
        }
        throw new IllegalArgumentException("Flavor not found: " + name);
    }

    public IceCreamTopping checkTopping(String name) {
        for (IceCreamTopping topping : availableToppings) {
            if (topping.getName().equalsIgnoreCase(name)) {
                return topping;
            }
        }
        throw new IllegalArgumentException("Topping not found: " + name);
    }

    public OrderItem createOrderItem(String flavorName, int scoops, String toppingName, int toppingQuantity) {
        IceCreamFlavor flavor = checkFlavor(flavorName);
        IceCreamTopping topping = toppingName != null ? checkTopping(toppingName) : null;
        return new OrderItem(flavor, scoops, topping, toppingQuantity);
    }
}
