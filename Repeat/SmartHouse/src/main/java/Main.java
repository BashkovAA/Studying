import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<LightingDevice> lightingDevices = new TreeSet<>(new Comparator<LightingDevice>() {
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
