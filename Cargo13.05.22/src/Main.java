public class Main {
    public static void main(String[] args) {
        Dimensions parcelDimensions = new Dimensions();
        parcelDimensions.setHeight(0.12);
        Cargo parcel = new Cargo();
        parcel.setCargoFragile(true);
        System.out.println(parcel);
        parcelDimensions.volumeCargo();
    }
}
