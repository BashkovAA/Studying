public interface ElectricDevice {

    boolean isSwitchOn();
    void switchOn();
    void switchOff();
    double getEnergyConsumption();

    default void toggle() {
        if (isSwitchOn()) {
            switchOff();
        } else {
            switchOn();
        }
    }
}
