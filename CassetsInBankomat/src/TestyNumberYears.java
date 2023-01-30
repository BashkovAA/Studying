public class TestyNumberYears {
    public static void main(String[] args) {
        int a = 5, b = 5, c = 5, d = 5;

        int c1 = --a + a--;
        int c2 = b-- + --b;
        int c3 = ++c - c++;
        int c4 = d++ - ++d;

        System.out.println(c1 + " " + c2 + " " + c3 + " " + c4);
    }
}
