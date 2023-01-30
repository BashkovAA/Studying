public class Main {
    public static void main(String[] args) {
        Bus bus = new ElectricBus(0.001, 0.1);
        bus.refuel(1);
        System.out.println("Резерв: " + bus.powerReserve());
        System.out.println("Едем 50 км " + bus.run(50));
        System.out.println("Резерв: " + bus.powerReserve());
        System.out.println("Едем 900 км " + bus.run(900));
        System.out.println("Резерв: " + bus.powerReserve());
        System.out.println("Едем 100 км " + bus.run(100));
        System.out.println("Резерв: " + bus.powerReserve());

        Bus bus1 = new Bus(0.001);
        Bus bus2 = new Bus(0.001);
        Bus bus3 = new Bus(0.001);

        Bus eBus1 = new ElectricBus(0.001, 0.1);
        Bus eBus2 = new ElectricBus(0.001, 0.1);
        Bus eBus3 = new ElectricBus(0.001, 0.1);

        System.out.println("Количество автобусов: " + bus.getCount());
        System.out.println("Количество электробусов: " + ElectricBus.getCount());


    }
}
