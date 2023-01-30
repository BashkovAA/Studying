public class Main {
    public static void main(String[] args) {
        Client Jack = new PhysicalPerson();
        Client Mary = new LegalPerson();

        Mary.put(20000);
        System.out.println(Jack.put(1000));
        System.out.println(Mary.take(15000));
    }
}
