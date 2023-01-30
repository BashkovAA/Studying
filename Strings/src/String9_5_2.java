public class String9_5_2 {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        int numberStart = -1;
        int index = 0;
        int sum = 0;
        while (index >= 0) {
            index = text.indexOf(' ', index + 1);
//            System.out.println("index1 " + index);
            if (Character.isDigit(text.charAt(index + 1))) {
                numberStart = index + 1;
//                System.out.println("index2 " + index);
//                System.out.println("numberStart " + numberStart);
            }
            if (numberStart > 0 && Character.isDigit(text.charAt(index - 1))) {
                sum += Integer.parseInt(text.substring(numberStart, index));
                numberStart = -1;
//                System.out.println("indexN " + index);
//                System.out.println("sum " + sum);
            }
        }
        System.out.println(sum);
    }
}
