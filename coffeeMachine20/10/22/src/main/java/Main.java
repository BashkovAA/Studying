public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;

        boolean notBlocked = true;

        int cappuccinoMilkRequired = 60;
        int cappuccinoCoffeeRequired = 15;

        boolean coffeeIsEnough = coffeeAmount >= cappuccinoCoffeeRequired;
        boolean milkIsEnough = milkAmount >= cappuccinoMilkRequired || skimmedMilkAmount >= cappuccinoMilkRequired;

        if (notBlocked && coffeeIsEnough && milkIsEnough) {
            System.out.println("Готовим капучинно");
        } else System.out.println("Кофе-машина заблокирована");
    }
}
