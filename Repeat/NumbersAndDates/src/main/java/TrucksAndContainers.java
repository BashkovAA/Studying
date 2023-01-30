import java.util.Scanner;

public class TrucksAndContainers {
    public static final int BOXES_IN_CONTAINER = 27;
    public static final int CONTAINER_IN_TRUCK = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //получение количество коробок от пользователя
        System.out.println("Введите количество коробок для доставки:");
        int boxes = scanner.nextInt();
        int containers = boxes / BOXES_IN_CONTAINER + (boxes % BOXES_IN_CONTAINER == 0 ? 0 : 1);
        int trucks = containers / CONTAINER_IN_TRUCK + (containers % CONTAINER_IN_TRUCK == 0 ? 0 : 1);
        int countBoxes = 0;
        int containersCount = containers;
        int trucksCount = trucks;

        for (int i = 0; trucksCount > 0; trucksCount--) {
            System.out.println("Грузовик: " + ++i);

            for (int c = 0; c < CONTAINER_IN_TRUCK & containersCount > 0; containersCount--) {
                System.out.println("\t" + "Контейнер: " + ++c);

                for (int b = 0;  b < BOXES_IN_CONTAINER & countBoxes < boxes; b++) {
                    System.out.println("\t\t" + "Ящик: " + ++countBoxes);
                }
            }
        }

        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + trucks + " шт.");
        System.out.println("контейнеров - " + containers + " шт.");


        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }
}