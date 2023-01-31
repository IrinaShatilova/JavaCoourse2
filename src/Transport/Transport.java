package Transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int speedMax;

    public Transport(String brand,
                     String model,
                     int year,
                     String color,
                     String country,
                     int speedMax) {
        this.brand = validateString(brand);
        this.model = validateString(model);
        this.year = validateYear(year);
        this.country = validateString(country);
        setColor(color);
        setSpeedMax(speedMax);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validateColor(color);
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = validateSpeedMax(speedMax);
    }

    @Override
    public String toString() {
        return "Автомобиль: марка - " + brand +
                ", модель - " + model +
                ", цвет кузова - " + color +
                ", год выпуска = " + year +
                ", страна сборки - " + country +
                ", максимальная скорость - " + speedMax + " км/час";

    }
    public static String validateString (String zeroValue){
        return (zeroValue == null || zeroValue.isBlank() || zeroValue.isEmpty()) ? "default" : zeroValue;
    }
    public static int validateYear (int zeroValue){
        return zeroValue <= 0 ? 2000 : zeroValue;
    }
    public static String validateColor (String zeroValue){
        return (zeroValue == null || zeroValue.isBlank() || zeroValue.isEmpty()) ? "white" : zeroValue;
    }
    public static int validateSpeedMax (int zeroValue){
        return zeroValue <=0 ? 140 : zeroValue;
    }
}
