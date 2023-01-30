public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(EngineType.PETROL, 3.5, 180);
        Car car1 = new Car(engine, CarType.SUV, 500);

        System.out.println("Тип автомобиля: " + car1.getType());
        System.out.println("Масса автомобиля: " + car1.getWeight());
        System.out.println("Тип двигателя: " + engine.getEngineType());
        System.out.println("Обьём двигателя: " + engine.getVolume());
        System.out.println("Мощность двигателя: " + engine.getPower());
    }
}
