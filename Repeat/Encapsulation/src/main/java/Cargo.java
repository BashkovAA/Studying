public class Cargo {
    private final Dimensions dimensions;
    private final int weight;
    private final String address;
    private final boolean possibleFlip;
    private final String registrationNumber;
    private final boolean fragile;

    public Cargo(Dimensions dimensions, int weight, String address, boolean possibleFlip, String registrationNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.possibleFlip = possibleFlip;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }

    public Cargo setAddress(String address) {
        return new Cargo(dimensions, weight, address, possibleFlip, registrationNumber, fragile);
    }
    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, address, possibleFlip, registrationNumber, fragile);
    }
    public Cargo setWeight(int weight) {
        return new Cargo(dimensions, weight, address, possibleFlip, registrationNumber, fragile);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public boolean isPossibleFlip() {
        return possibleFlip;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragile() {
        return fragile;
    }
}
