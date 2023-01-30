public class GeometryCalculator {
    public static void squareCircle(double radius) {
        double squareCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь круга: " + squareCircle);
    }
    public static void squareTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double squareTriangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь треугольника: " + squareTriangle);
    }
    public static void volumeBall(double radius)  {
        double volumeBall = 4 / 3 * Math.PI * Math.pow(radius, 3);
        System.out.println("Площадь шара: " + volumeBall);
    }
    public static void possibillityTriangle(double a, double b, double c) {
        boolean first = (a + b) > c;
        boolean second = (a + c) > b;
        boolean third = (c + b) > a;
        if (first & second & third) {
            System.out.println("Возможно построение треугольника");
        } else System.out.println("Невозможно построение треугольника");
    }
}
