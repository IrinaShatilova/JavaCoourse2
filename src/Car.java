public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final Integer year;
    private final String country;

    public Car(String brand, String model, double engineVolume, String color, Integer year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Автомобиль: марка - " + brand +
                ", модель - " + model +
                ", объем двигателя = " + engineVolume + " л" +
                ", цвет кузова - " + color +
                ", год выпуска = " + year +
                ", страна сборки - " + country;
    }
}
