import java.util.Random;
import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        System.out.println("Введите количесвто пациентов:");
        int patientsCount = new Scanner(System.in).nextInt();
        for(float temperature : generatePatientsTemperatures(patientsCount)) {
            System.out.println(temperature);
        }
    }
    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] temperaturesDate = new float[patientsCount];
//        Random temperature = new Random();
        for (int i = 0; i < temperaturesDate.length; i++) {
            temperaturesDate[i] = (float) ((Math.random() * ((36.9 - 32.6) + 1)) + 32.6);
//            temperature.nextFloat();
        }
        return temperaturesDate;
    }
}
