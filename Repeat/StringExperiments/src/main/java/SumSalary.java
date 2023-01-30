public class SumSalary {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша 30000 рублей";
        String salary = "";
        int start = 0;
        int end = 0;
        int sumSalary = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                start = i;
                end = start;
                while (Character.isDigit(text.charAt(i))) {
                    salary.concat(text.indent(i));
                    end++;
                    i++;
                }
                sumSalary += Integer.parseInt(text.substring(start, end));
            }
        }

        System.out.println("Сумма зарплат: " + sumSalary);
    }
}
