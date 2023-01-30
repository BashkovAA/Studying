public class ImmutableProduct {
    private final String name;
    private int price;
    private final int barCode;

    public ImmutableProduct(String name, int barCode) {
        this.name = name;
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
