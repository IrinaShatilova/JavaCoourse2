package Transport;

public class Car extends Transport<DriverB> {
    public Car(
            String brand,
            String model,
            double engineVolume,
            DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль марки " +getBrand() + "начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автомобиль марки " +getBrand() + "закончил движение");
    }
    @Override
    public void pitStop() {
        System.out.println("Пит-стоп автомобиля");
    }

    @Override
    public void bestLapTime() {
        int min= 80;
        int max= 120;
        int maxLapTime = (int) (min+(max+min)*Math.random());
        System.out.println("Лучшее время прохождения круга автомобиля " + maxLapTime+ " мин");
    }
    @Override
    public void maxSpeed() {
        int min=120;
        int max=200;
        int maxSpeed = (int) (min+(max+min)*Math.random());
        System.out.println("Максимальная скорость автомобиля " + maxSpeed + " км/час");
    }
}
