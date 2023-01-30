public class Cargo {
    private final Dimensions dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final Boolean flipPossible;
    private final String registrationNumber;
    private final Boolean cargoFragile;

    public Cargo(Dimensions dimensions, double weight, String deliveryAddress, Boolean flipPossible, String registrationNumber, Boolean cargoFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.flipPossible = flipPossible;
        this.registrationNumber = registrationNumber;
        this.cargoFragile = cargoFragile;
    }

    public Cargo() {
        this.dimensions = new Dimensions();
        weight = 0;
        deliveryAddress = "N/A";
        flipPossible = true;
        registrationNumber = "N/a";
        cargoFragile = false;
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, deliveryAddress, flipPossible, registrationNumber, cargoFragile);
    }
    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, deliveryAddress, flipPossible, registrationNumber, cargoFragile);
    }
    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(dimensions, weight, deliveryAddress, flipPossible, registrationNumber, cargoFragile);
    }
    public Cargo setFlipPossible(Boolean flipPossible) {
        return new Cargo(dimensions, weight, deliveryAddress, flipPossible, registrationNumber, cargoFragile);
    }
    public Cargo setRegistrationNumber(String registrationNumber) {
        return new Cargo(dimensions, weight, deliveryAddress, flipPossible, registrationNumber, cargoFragile);
    }
    public Cargo setCargoFragile(Boolean cargoFragile) {
        return new Cargo(dimensions, weight, deliveryAddress, flipPossible, registrationNumber, cargoFragile);
    }

    public String toString() {
        return "Размеры " + dimensions + "\n" +
                "Вес " + weight + "\n" +
                "Адресс доставки " + deliveryAddress + "\n" +
                "Можно лли переворачивать " + flipPossible + "\n" +
                "Регистрационный номер " + registrationNumber + "\n" +
                "Хрупкий ли груз " + cargoFragile;
    }
}
