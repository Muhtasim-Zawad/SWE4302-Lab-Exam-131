import java.util.List;

public class IceCreamFactory {
    private final List<IceCreamFlavor> availableFlavors;
    private final List<IceCreamTopping> availableToppings;

    public IceCreamFactory(List<IceCreamFlavor> flavors, List<IceCreamTopping> toppings) {
        this.availableFlavors = flavors;
        this.availableToppings = toppings;
    }

    public IceCreamFlavor createFlavor(String name) {
        return availableFlavors.stream()
                .filter(f -> f.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Flavor not found: " + name));
    }

    public IceCreamTopping createTopping(String name) {
        return availableToppings.stream()
                .filter(t -> t.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Topping not found: " + name));
    }

    public OrderItem createOrderItem(String flavorName, int scoops, String toppingName, int toppingQuantity) {
        IceCreamFlavor flavor = createFlavor(flavorName);
        IceCreamTopping topping = toppingName != null ? createTopping(toppingName) : null;
        return new OrderItem(flavor, scoops, topping, toppingQuantity);
    }
}
