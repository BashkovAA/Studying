import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String path = "A:\\Studying\\movementList.csv";
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(path));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        HashMap<String, Double> data = new HashMap<>();

        String firstLine = null;
        for (String line : lines) {
            if (firstLine == null) {
                firstLine = line;
                continue;
            }
            String[] fragments = line.split("\\,");
            if (fragments.length != 8) {
                System.out.println("Wrong line: " + line);
                continue;
            }
            String paymentType = getTypePayment(fragments[5]);
            double expense = Double.parseDouble(fragments[7]);
            if (expense == 0) {
                continue;
            }

            if (!data.containsKey(paymentType)) {
                data.put(paymentType, 0.0);
            }
            data.put(paymentType, data.get(paymentType) + expense);
        }

        for (String payment : data.keySet()) {
            double sum = data.get(payment);
            System.out.println(payment + "\t" + sum);
        }
    }

    public static String getTypePayment(String typePayment) {
        String regex = "[^a-zA-Z0-9]([a-zA-Z0-9\s]+)[0-9]{2}\\.[0-9]{2}\\." +
                "[0-9]{2}\s[0-9]{2}\\.[0-9]{2}\\.[0-9]{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(typePayment);

        return matcher.find() ? matcher.group(1).trim() : null;
    }

//        String path =
//                "A:\\Studying\\movementList.csv";
//        List<String> lines = new ArrayList<>();
//        try {
//            lines = Files.readAllLines(Paths.get(path));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        HashMap<String, Double> expence2sum = new HashMap<>();
//
//        String firstLine = null;
//        for (String line : lines) {
//            if (firstLine == null) {
//                firstLine = line;
//                continue;
//            }
//            String[] tokens = line.split(",");
//            double expense = Double.parseDouble(tokens[7]);
//            if (expense == 0) {
//                continue;
//            }
//            String paymentType = getPaymentType(tokens[5]);
//            if (!expence2sum.containsKey(paymentType)) {
//                expence2sum.put(paymentType, 0.);
//            }
//            expence2sum.put(
//                    paymentType,
//                    expence2sum.get(paymentType) + expense
//            );
//        }
//
//        for (String paymentType : expence2sum.keySet()) {
//            double sum = expence2sum.get(paymentType);
//            System.out.println(paymentType + "\t" + sum);
//        }
//    }
//
//    private static String getPaymentType(String info) {
//        String regex = "[^a-zA-Z0-9]([a-zA-Z0-9\s]+)[0-9]{2}\\.[0-9]{2}\\.[0-9]{2}\s[0-9]{2}\\.[0-9]{2}\\.[0-9]{2}";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(info);
//        return matcher.find() ? matcher.group(1).trim() : null;
//    }
}

