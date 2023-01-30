public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 1000;
        int skimmedMilkAmount = 1290;
        int lowLactoseMilk = 1000;
        int s = 3;

        boolean isBlocked = false;

        int cappuchinoMilkRequiered = 1200; // in grams
        int cappuchinoCoffeeRequired = 15; // in grams

        // todo: Check another coffee types
        boolean milkIsEnough = milkAmount >= cappuchinoMilkRequiered || skimmedMilkAmount >= cappuchinoMilkRequiered || lowLactoseMilk >= cappuchinoMilkRequiered;
        boolean coffeeIsEnough = coffeeAmount >= cappuchinoCoffeeRequired;

        if (isBlocked) {
            System.out.println("Кофе машина заблокирована"); s = s-1;
        }
        if (!coffeeIsEnough) {
                System.out.println("Кофе недостаточно"); s = s-1;
        }
        if (!milkIsEnough) {
            System.out.println("Молока недостаточно"); s = s-1;
        }
        if (s == 3) {
               System.out.println("Готовим каппучино");
        }
    }
}
