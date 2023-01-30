public class Arithmetic {
    private int numberOne = 0;
    private int numberTwo = 0;

    public Arithmetic(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public void sumNumbers() {
        int sum = numberOne + numberTwo;
        System.out.println("Сумма чисел: " + sum);
    }
    public void multiplyNumber() {
        int multiply = numberOne * numberTwo;
        System.out.println("Произведение чисел: " + multiply);
    }
    public void maxNumber() {
        int max = numberOne;
        if (numberOne > numberTwo) {
            max = numberOne;
            System.out.println("Максимальное число: " + max);
        } else if (numberTwo > numberOne) {
            max = numberTwo;
            System.out.println("Максимальное число: " + max);
        } else {
            System.out.println("Числа равны: " + max);
        }
    }
    public void minNumber() {
        int min = numberOne;
        if (numberOne < numberTwo) {
            min = numberOne;
            System.out.println("Минимальное число: " + min);
        } else if (numberTwo > numberOne) {
            min = numberTwo;
            System.out.println("Минимальное число: " + min);
        } else {
            System.out.println("Числа равны: " + min);
        }
    }
}
