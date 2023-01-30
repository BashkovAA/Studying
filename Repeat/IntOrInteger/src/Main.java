public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

        int firstCapitalLetter = 'А';
        int lastCapitalLetter = 'Я';
        int firstLowercaseLetter = 'а';
        int lastLowercaseLetter = 'я';
        int capitalLetterSearch = 'Ё';
        int lowerLetterSearch = 'ё';
        char eLower = (char) lowerLetterSearch;
        char capitalE = (char) capitalLetterSearch;

        for (int i = firstCapitalLetter; i <= lastCapitalLetter; i = i + 1) {
            char letter = (char) i;
            System.out.println(i + " - " + letter);
        }
        for (int i = firstLowercaseLetter; i <= lastLowercaseLetter; i = i + 1) {
            char letter = (char) i;
            System.out.println(i + " - " + letter);
        }
        System.out.println(capitalLetterSearch + " - " + capitalE +
                "\n" + lowerLetterSearch + " - " + eLower);
    }
}
