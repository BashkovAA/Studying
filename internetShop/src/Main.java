public class Main {
    public static void main(String[] args) {

        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко", 60);
        vasyaBasket.add("Хлеб", 30);

        Basket petyaBasket = new Basket(500);
        petyaBasket.add("Лопата", 280);
        petyaBasket.add("Бочка", 2900, 4, 2.5);

        Basket mashaBasket = new Basket("Стол", 5000);

        vasyaBasket.print("Корзина Васи:");
        System.out.println("\n");
        petyaBasket.print("Корзина Пети:");
        System.out.println("\n");
        System.out.println("Корзина Маши:");

    }
}
