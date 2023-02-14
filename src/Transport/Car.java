package Transport;


import java.util.List;

public class Car extends Transport<DriverB> {
    private BodyType bodyType;

    public Car(
            String brand,
            String model,
            double engineVolume,
            DriverB driver,
            List<Mechanic> mechanicList,
            BodyType bodyType
    ) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.bodyType = bodyType;

    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль марки " + getBrand() + "начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автомобиль марки " + getBrand() + "закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп автомобиля");
    }

    @Override
    public void bestLapTime() {
        int min = 80;
        int max = 120;
        int maxLapTime = (int) (min + (max + min) * Math.random());
        System.out.println("Лучшее время прохождения круга автомобиля " + maxLapTime + " мин");
    }

    @Override
    public void maxSpeed() {
        int min = 120;
        int max = 200;
        int maxSpeed = (int) (min + (max + min) * Math.random());
        System.out.println("Максимальная скорость автомобиля " + maxSpeed + " км/час");
    }

    @Override
    public void printType() {
        if (getBodyType() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getBodyType());
        }
    }

    @Override
    public void passDiagnostics() {
        System.out.println(getBrand() + " - автомобиль прошел диагностику");
    }


}
