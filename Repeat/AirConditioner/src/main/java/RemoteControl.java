public class RemoteControl {
    private final int START_TEMPERATURE = 32;
    private int temperature;

    public RemoteControl() {
        temperature = START_TEMPERATURE;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
