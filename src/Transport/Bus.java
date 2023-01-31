package Transport;

public class Bus extends Transport<DriverD> {
    public Bus(
            String brand,
            String model,
            double engineVolume,
            DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + "начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + "закончил движение");

    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп автобуса");
    }

    @Override
    public void bestLapTime() {
            int min=100;
            int max=150;
            int maxLapTime = (int) (min+(max+min)*Math.random());
        System.out.println("Лучшее время прохождения круга автобуса " + maxLapTime+ " мин");
    }
    @Override
    public void maxSpeed() {
        int min=80;
        int max=140;
        int maxSpeed = (int) (min+(max+min)*Math.random());
        System.out.println("Максимальная скорость автобуса " + maxSpeed + " км/час");
    }
}
