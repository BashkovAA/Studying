public class Elevator {

    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
    public void moveDown() {
        currentFloor = currentFloor > minFloor? currentFloor - 1 : currentFloor;
    }
    public void moveUp() {
        currentFloor = currentFloor < maxFloor? currentFloor + 1 : currentFloor;
    }
    public void move(int floor) {
        if ((floor < currentFloor || floor > currentFloor) & floor >= minFloor & floor <= maxFloor) {
            System.out.println("Текущий этаж " + currentFloor);
            while (floor < currentFloor || floor > currentFloor) {
                if (currentFloor < floor) {
                    moveUp();
                    System.out.println("Текущий этаж " + currentFloor);
                } else if (currentFloor > floor) {
                    moveDown();
                    System.out.println("Текущий этаж " + currentFloor);
                }
            }
        } else if (floor == currentFloor) {
            System.out.println("Вы на нужном этаже " + currentFloor);
        } else System.out.println("Ошибка, вы ввели невозможный этаж");
    }
}
