public class Main {
    public static void main(String[] args) {
        int vasyaAge = 85;
        int katyaAge = 45;
        int mishaAge = 75;

        int min = -1;
        int middle = -1;
        int max = -1;

        min = vasyaAge;
        middle = vasyaAge;
        max = vasyaAge;

        if (katyaAge > vasyaAge && katyaAge > mishaAge) {
            max = katyaAge;
        } else if (mishaAge >= vasyaAge && mishaAge >= katyaAge) {
            max = mishaAge;
        }
        if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
        } else if (mishaAge <= vasyaAge && mishaAge <= katyaAge) {
            min = mishaAge;
        }
        if (katyaAge >= vasyaAge && katyaAge <= mishaAge || katyaAge <= vasyaAge && katyaAge >= mishaAge) {
            middle = katyaAge;
        } else if (mishaAge >= vasyaAge && mishaAge <= katyaAge || mishaAge >= katyaAge && mishaAge <= vasyaAge) {
            middle = mishaAge;
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }
}
