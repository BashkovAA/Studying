import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3,26);

        while (true) {
            System.out.println("Введите номер этажа:");
            System.out.println("Текущий этаж: " + elevator.getCurrentFloor());
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    }
}
