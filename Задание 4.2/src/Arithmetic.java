public class Arithmetic {
    private int firstNumber;
    private int secondNumber;

    public Arithmetic(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void sum() {
        int sum = firstNumber + secondNumber;
        System.out.println("Сумма чисел: " + sum);
    }
    public void multiply() {
        int multiply = firstNumber * secondNumber;
        System.out.println("Произведение чисел: " + multiply);
    }
    public void max() {
        int max;
        if (firstNumber > secondNumber) {
            max = firstNumber;
            System.out.println("Большое число: " + max);
        } else if (secondNumber > firstNumber) {
            max = secondNumber;
            System.out.println("Большое число: " + max);
        } else {
            System.out.println("Числа равны");
        }
    }
    public void min() {
        int min;
        if (firstNumber < secondNumber) {
            min = firstNumber;
            System.out.println("Меньшее число: " + min);
        } else if (secondNumber < firstNumber) {
            min = secondNumber;
            System.out.println("Меньшее число: " + min);
        } else {
            System.out.println("Числа равны");
        }
    }
}
