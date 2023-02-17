package Transport;

import java.util.List;

public class Truck extends Transport<DriverC>{
    private LoadCapacity loadCapaciti;
    public Truck(
            String brand,
            String model,
            double engineVolume,
            DriverC driver,
            List<Mechanic> mechanicList,
            LoadCapacity loadCapaciti) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.loadCapaciti=loadCapaciti;
    }

    public LoadCapacity getLoadCapaciti() {
        return loadCapaciti;
    }

    public void setLoadCapaciti(LoadCapacity loadCapaciti) {
        this.loadCapaciti = loadCapaciti;
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

    @Override
    public void printType() {
        if (getLoadCapaciti() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }else {
            System.out.println(getLoadCapaciti());
        }
    }
    @Override
    public void passDiagnostics() {
        System.out.println(getBrand() + " - грузовик прошел диагностику");
    }

}
