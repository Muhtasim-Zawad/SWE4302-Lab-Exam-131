public class OrderItem {
    private final IceCreamFlavor flavor;
    private final int scoops;
    private final IceCreamTopping topping;
    private final int toppingQuantity;

    public OrderItem(IceCreamFlavor flavor, int scoops, IceCreamTopping topping, int toppingQuantity) {
        this.flavor = flavor;
        this.scoops = scoops;
        this.topping = topping;
        this.toppingQuantity = toppingQuantity;
    }

    public double calculateItemPrice() {
        double flavorPrice = flavor.getPrice() * scoops;
        double toppingPrice = topping.getPrice() * toppingQuantity;
        return flavorPrice + toppingPrice;
    }

    public String getDetails() {
        return flavor.getName() + " - " + scoops + " scoop(s): $" + flavor.getPrice() * scoops + "\n" +
                (topping != null ? topping.getName() + " - " + toppingQuantity + " time(s): $" + topping.getPrice() * toppingQuantity + "\n" : "");
    }
}
