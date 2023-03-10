public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    public Basket(int limit) {
        items = "Список товаров";
        this.limit = limit;
    }
    public Basket() {
        this();
        this.limit = 1000000;
    }
    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public void add(String name, int price) {
        add(name, price,1);
    }

    public void add(String name, int price, int count) {
        add(name, price, count, 0);
    }
    public void add(String name, int price, int count, double weight) {
        if (contains(name)) {
            return;
        }
        if(totalPrice + count * price >= limit) {
            return;
        }
        items = items + "\n" + name + "-" +
                count + " шт. - " + price + " Общий вес корзины(кг): " + getTotalWeight();
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;
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
        return (items.contains(name));
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }

    }
}
