import java.util.Scanner;

public class Strings9_3 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите выражение");
            String expression = new Scanner(System.in).nextLine();
            expression.trim();
            String tokens[] = expression.split(" ");

            int firstNumber = Integer.parseInt(tokens[0]);
            int secondNumber = Integer.parseInt(tokens[2]);
            String sign = tokens[1];

            int result = 0;

            switch (sign) {
                case "+" :
                    result = firstNumber + secondNumber;
                    break;
                    case "-" :
                    result = firstNumber - secondNumber;
                    break;
                    case "/" :
                    result = firstNumber / secondNumber;
                    break;
                    case "*" :
                    result = firstNumber * secondNumber;
                    break;
            }

            System.out.println(expression.concat(" = ").concat(Integer.toString(result)));
        }
    }
}
