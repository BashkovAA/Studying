public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;

        int currentVolume = 0;
        int timeInMinutes = 0;

        while (true) {
            currentVolume = currentVolume + fillingSpeed - devastationSpeed;
            timeInMinutes = timeInMinutes + 1;
            if (currentVolume == volume) break;
        }
        System.out.println("Время наполнения бассейна: " + timeInMinutes + " минут");
    }
}
