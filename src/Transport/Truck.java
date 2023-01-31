package Transport;

public class Truck extends Transport {
    public Truck(
            String brand,
            String model,
            double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println("Грузовой автомобиль марки " + getBrand() + "начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовой автомобиль марки " + getBrand() + "закончил движение");

    }
}
