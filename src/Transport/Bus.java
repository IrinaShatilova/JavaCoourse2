package Transport;

import java.util.List;

public class Bus extends Transport<DriverD> {
    private Size size;

    public Bus(
            String brand,
            String model,
            double engineVolume,
            DriverD driver,
            List<Mechanic> mechanicList,
            Size size) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.size = size;

    }
    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
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
    @Override
    public void printType() {
        if (getSize() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }else {
            System.out.println(getSize());
        }
    }

    @Override
    public void passDiagnostics() throws TransportTypeException {
        throw new TransportTypeException("Автобусы диагностику не проходят");

    }
}
