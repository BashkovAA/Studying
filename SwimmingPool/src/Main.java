public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30;
        int devationSpeed = 10;
        int currentVolume = 0;
        int fillingTime = 0;

        while (currentVolume < volume) {
            currentVolume = currentVolume + fillingSpeed - devationSpeed;
            fillingTime = fillingTime + 1;
        }
        System.out.println("Время наполнения бассейна " + fillingTime + " минут");
    }
}
