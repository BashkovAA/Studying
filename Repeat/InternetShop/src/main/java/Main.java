public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket(100);
        vasyaBasket.add("Молоко", 55);
        vasyaBasket.add("Хлеб", 32);

        Basket petyaBasket = new Basket(500);
        petyaBasket.add("Лопата", 280);
        petyaBasket.add("Бочка", 2900,1,10);

        Basket mashaBasket = new Basket("Стол", 5000);
        Session session = new Session();

        DeliveryOrder deliveryOrder = new DeliveryOrder(DeliveryType.AUTO, Fragile.NO, Cold.YES);



        vasyaBasket.print("Корзина Васи");
        petyaBasket.print("Корзина Пети");
        mashaBasket.print("Корзина Маши");

        System.out.println("Стоимотсь всех корзин: " + Basket.getAllBasketsTotalPrice());
        System.out.println("Колистчо корзин: " + Basket.getCount());
        System.out.println("Количество товаров: " + Basket.getProductsCount());
        System.out.println("Отношение общей стоимости всех корзин к общему количеству всех товаров: " + Basket.averageProductPrice());
        System.out.println("Отношение общей стоимости всех корзин к количеству корзин: " + Basket.averageBasketPrice());
    }
}
