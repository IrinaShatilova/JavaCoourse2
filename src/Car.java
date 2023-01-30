public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final Integer year;
    private final String country;

    public Car(String brand, String model, double engineVolume, String color, Integer year, String country) {
        this.brand = validateString(brand);
        this.model = validateString(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.color = validateColor(color);
        this.year = validateYear(year);
        this.country = validateString(country);
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
    public static String validateString (String zeroValue){
        return (zeroValue == null || zeroValue.isBlank() || zeroValue.isEmpty()) ? "default" : zeroValue;
    }
    public static double validateEngineVolume (double zeroValue){
        return zeroValue <= 0 ? 1.5 : zeroValue;
    }
    public static Integer validateYear (Integer zeroValue){
        return zeroValue == null ? 2000 : zeroValue;
    }
    public static String validateColor (String zeroValue){
        return (zeroValue == null || zeroValue.isBlank() || zeroValue.isEmpty()) ? "white" : zeroValue;
    }
}