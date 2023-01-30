public class Main {
    public static void main(String[] args) {
        String text = "FIFA ! will! never. regret , it";
        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        for(String word : words){
            System.out.println(word);
        }
    }
}
