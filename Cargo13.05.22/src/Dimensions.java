public class Dimensions {
    private final double width; //metre
    private final double height; //metre
    private final double length; //metre

    public Dimensions(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Dimensions() {
        width = 1;
        height = 1;
        length = 1;
    }

    public Dimensions setWidth(double width) {
        return new Dimensions(width, height, length);
    }
    public Dimensions setHeight(double height) {
        return new Dimensions(width, height, length);
    }
    public Dimensions setLength(double length) {
        return new Dimensions(width, height, length);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public void volumeCargo() {
        double volume = width + height + length;
        System.out.println("Обьём " + volume + " м3");
    }

    public String toString() {
        return "\n" + "Ширина " + width + " (м)\n" +
                "Высота " + height + " (м)\n" +
                "Длина " + length + "  (м)";
    }
}
