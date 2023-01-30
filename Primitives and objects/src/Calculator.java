public class Calculator {

    private int a;
    private int b;
    private int c;

    public Calculator(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int multiply() {
        return a * b * c;
    }
}
