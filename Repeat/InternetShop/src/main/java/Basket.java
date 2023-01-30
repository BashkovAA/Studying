import java.time.Period;

public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    private static int count = 0;
    private static int productsCount = 0;
    private static int allBasketsTotalPrice = 0;
//    private static int timeout = getTimeout();

    public static double averageProductPrice() {
        return allBasketsTotalPrice / productsCount;
    }
    public static double averageBasketPrice() {
        return allBasketsTotalPrice / count;
    }

//    private static int getTimeout() {
//        int secondsInHour = 3600;
//        int hoursInDAy = 24;
//        int daysInWeek = 7;
//        int daysInMonth = 30;
//        timeout = secondsInHour * hoursInDAy * (Period.type == PeriodType.WEEK ? daysInWeek : daysInMonth);
//    }

    public Basket() {
        count = count + 1;
        items = "Список товаров:";
        limit = 100000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + "\n" + items + " - " + totalPrice;
        this.totalPrice = totalPrice;
        productsCount = productsCount + 1;
        allBasketsTotalPrice = allBasketsTotalPrice + totalPrice;
    }

    public static int getCount() {
        return count;
    }
    public static int getProductsCount() {
        return productsCount;
    }
    public static int getAllBasketsTotalPrice() {
        return allBasketsTotalPrice;
    }

    public void add(String name, int price) {
        add(name, price,1,0);
    }
    public void add(String name, int price, int count) {
        add(name, price, count,0);
    }

    public void add(String name, int price, int count, double weight) {
        productsCount = productsCount + count;
        allBasketsTotalPrice = allBasketsTotalPrice + price * count;
        if(contains(name)) {
            return;
        }
        if(totalPrice + count * price >= limit) {
            return;
        }
        items = items + "\n" + name + " - " + count +
                " шт." + " - " + " Вес: " + weight + " Цена: " + price;
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if(items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items + "\n");
        }
    }
}
