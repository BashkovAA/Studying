public class Engine {
    public final EngineType engineType;
    public final double volume;
    public final int power;

    public Engine(EngineType engineType, double volume, int power) {
        this.engineType = engineType;
        this.volume = volume;
        this.power = power;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public double getVolume() {
        return volume;
    }

    public int getPower() {
        return power;
    }
}
