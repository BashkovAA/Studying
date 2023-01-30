import java.util.ArrayList;

public class SmartHouse {
    private ArrayList<ElectricDevice> devices;

    public SmartHouse() {
        devices = new ArrayList<>();
        initLightingDevices();
    }

    public void switchOffAllDevices() {
        for (ElectricDevice device : devices) {
            device.switchOff();
        }
    }

    public double getEnergyConsumption() {
        double sum = 0.0;
        for (ElectricDevice device : devices) {
            sum += device.getEnergyConsumption();
        }
        return sum;
    }

    public void switchOffAllLight() {
        for (ElectricDevice device : devices) {
            if (device instanceof LightingDevice) {
                device.switchOff();
            }
        }
    }

    private void initLightingDevices() {
        devices.add(new Lamp(100));
        devices.add(new Lamp(60));
        devices.add(new Lamp(40));
        devices.add(new Chandelier(100, 4));
        devices.add(new Chandelier(400, 5));
        devices.add(new Chandelier(250, 10));
        devices.add(new Chandelier(120, 3));
    }
}
