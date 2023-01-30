public class Product {
    private final String name;
    private final int price;
    private static int count;
    private static int totalPrice;

    public Product(String name, int count, int price) {
        this.name = name;
        this.price = price;
        Product.count = Product.count + count;
        Product.totalPrice = Product.totalPrice + price * count;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static int getCount() {
        return count;
    }

    public static double getAveragePrice() {
        return (double) totalPrice / count;
    }

    public String toString() {
        return "\n" + "Название: " + name +
                "\n" + "Цена: " + price +
                "\n" + "Колличсетво: " + count +
                "\n" + "Общая цена: " + totalPrice;
    }
}
