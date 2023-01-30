import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<LightingDevice> devices = new TreeSet<>(new Comparator<LightingDevice>() {
            @Override
            public int compare(LightingDevice o1, LightingDevice o2) {
                return Integer.compare(o1.getPower(), o2.getPower());
            }
        });

        LightingDevice lightingDevice = new LightingDevice(400) {
            @Override
            public double getEnergyConsumption() {
                return power * brightness;
            }
        };
    }
}
