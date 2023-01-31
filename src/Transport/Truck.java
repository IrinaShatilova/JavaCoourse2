package Transport;

public class Truck extends Transport<DriverC>{
    public Truck(
            String brand,
            String model,
            double engineVolume,
            DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Грузовой автомобиль марки " + getBrand() + "начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовой автомобиль марки " + getBrand() + "закончил движение");

    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп грузвого автомобиля");
    }

    @Override
    public void bestLapTime() {
        int min=100;
        int max=150;
        int maxLapTime = (int) (min+(max+min)*Math.random());
        System.out.println("Лучшее время прохождения круга грузового автомобиля " + maxLapTime+ " мин");
    }
    @Override
    public void maxSpeed() {
        int min=80;
        int max=140;
        int maxSpeed = (int) (min+(max+min)*Math.random());
        System.out.println("Максимальная скорость грузового автомобиля " + maxSpeed + " км/час");
    }
}
