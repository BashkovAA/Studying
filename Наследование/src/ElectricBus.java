public class ElectricBus extends Bus {
    private final double minimalTankFullnessRate;
    private static final double degradationRate = 0.0001;
    private static final double minimalRateToDegradation = 0.1;
    private static int count;

    public ElectricBus(double consumptionRate, double minimalTankFullnessRate) {
        super(consumptionRate);
        this.minimalTankFullnessRate = minimalTankFullnessRate;
        count++;
    }

    @Override
    public void refuel(double tankRate) {
        super.refuel(tankRate);
        consumptionRate += degradationRate;
    }


    @Override
    public int powerReserve() {
        double remainingRate = getTankFullnessRate() - minimalTankFullnessRate;
        if (remainingRate <= 0) {
            return 0;
        }
        return (int) (remainingRate / getConsumptionRate());
    }

    public static int getCount() {
        return count;
    }
}
