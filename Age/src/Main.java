public class Main {
    public static void main(String[] args) {
        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
        }
        if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
        }
        if (mishaAge <= vasyaAge && mishaAge<=katyaAge) {
            min =mishaAge;
        }

        if ((vasyaAge <= mishaAge && vasyaAge >= katyaAge) ||
                (vasyaAge >= mishaAge && vasyaAge <= katyaAge)) {
            middle = vasyaAge;
        }

        if ((mishaAge <= vasyaAge && mishaAge >= katyaAge) ||
                (mishaAge >= vasyaAge && mishaAge <= katyaAge)) {
            middle = mishaAge;
        }

        if ((katyaAge <= vasyaAge && katyaAge >= mishaAge) ||
                (katyaAge >= vasyaAge && katyaAge <= mishaAge)) {
            middle = katyaAge;
        }

        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
        }
        if (katyaAge >= vasyaAge && katyaAge >= mishaAge) {
            max = katyaAge;
        }
        if (mishaAge >= vasyaAge && mishaAge >= katyaAge) {
            max = mishaAge;
        }


        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximum age: " + max);
    }
}
