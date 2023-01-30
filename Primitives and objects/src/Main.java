public class Main {
    public static void main(String[] args) {
        Integer vasya = 6;
        Integer misha = vasya;
        vasya = 7;
        misha = 8;
        System.out.println(vasya + " " + misha);
    }
}
