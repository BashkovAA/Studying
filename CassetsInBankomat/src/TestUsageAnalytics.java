public class TestUsageAnalytics {
    public static void main(String[] args) {
        UsageAnalytics analytics = new UsageAnalytics();
        analytics.countVisits();
        analytics.countVisits();
        int visits = analytics.countVisits();
        System.out.println("Всего посещений: " + visits);
    }
}
