import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.regex.Pattern;

public class CoolNumbers {
    public LinkedList createCoolNumbers(int countAutoNumbers) {
        String lettersList = "[АВЕКМНОРСТУХ]";
        String regexAutoNumber = lettersList + "[0-9]{3}" + lettersList + "{2}[0-9]{2,3}";
        String template = "%s%d%s%d";
        String autoNumber = "";
        Pattern pattern = Pattern.compile(regexAutoNumber);
        LinkedList autoNumbers = new LinkedList();
        int i = 0;

        String firstLetter = "";
        String secondLetterOne = "";
        String secondLetterTwo = "";
        String secondLetter = "";

        while (i < countAutoNumbers) {
            int firstPart = new Random().nextInt(1,12);
            int thirdPartOne = new Random().nextInt(1,12);
            int thirdPartTwo = new Random().nextInt(1,12);

            firstLetter = randomLetter(firstPart);
            secondLetterOne = randomLetter(thirdPartOne);
            secondLetterTwo = randomLetter(thirdPartTwo);

            secondLetter = secondLetterOne.concat(secondLetterTwo);

            int firstNumber = new Random().nextInt(100, 999);
            int secondNumber = new Random().nextInt(10, 999);

            autoNumber = String.format(template, firstLetter, firstNumber, secondLetter, secondNumber);
            if (autoNumber.matches(regexAutoNumber)) {
                autoNumbers.add(autoNumber);
                i++;
//                System.out.println(autoNumber);
            }
        }
        return autoNumbers;
    }

    public String randomLetter(int letter) {
        String letterRandom = "";

        switch (letter) {
            case 1 : {
                letterRandom = "А";
                break;
            }
            case 2 : {
                letterRandom = "В";
                break;
            }
            case 3 : {
                letterRandom = "Е";
                break;
            }
            case 4 : {
                letterRandom = "К";
                break;
            }
            case 5 : {
                letterRandom = "М";
                break;
            }
            case 6 : {
                letterRandom = "Н";
                break;
            }
            case 7 : {
                letterRandom = "О";
                break;
            }
            case 8 : {
                letterRandom = "Р";
                break;
            }
            case 9 : {
                letterRandom = "С";
                break;
            }
            case 10 : {
                letterRandom = "Т";
                break;
            }
            case 11 : {
                letterRandom = "У";
                break;
            }
            case 12 : {
                letterRandom = "Х";
                break;
            }
        }
        return letterRandom;
    }
}
