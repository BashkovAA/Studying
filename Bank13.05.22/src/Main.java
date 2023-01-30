public class Main {
    public static void main(String[] args) {
        BankDetails details = new BankDetails();
        details.setBillNumber("3423543-604550-560--300");
        Company company = new Company("Смарт-зкспресс-4353453", details);
        // some code
        details.setBillNumber("3423543-604550-560--454");
        System.out.println(company);
    }
}
