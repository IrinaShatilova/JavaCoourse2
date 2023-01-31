package Transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final Integer year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int capacity;
    private boolean summerTyres;
    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               Integer year,
               String country,
               String transmission,
               String bodyType,
               String registrationNumber,
               int capacity,
               boolean summerTyres) {
        this.brand = validateString(brand);
        this.model = validateString(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.color = validateColor(color);
        this.year = validateYear(year);
        this.country = validateString(country);
        this.transmission = validateTransmission(transmission);
        this.bodyType = validateBodyType(bodyType);
        this.registrationNumber = validateRegistrationNumber(registrationNumber);
        this.capacity = validateCapacity(capacity);
        this.summerTyres = summerTyres;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validateColor(color);
    }

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = validateTransmission(transmission);
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = validateRegistrationNumber(registrationNumber);
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    @Override
    public String toString() {
        return "Автомобиль: марка - " + brand +
                ", модель - " + model +
                ", объем двигателя = " + engineVolume + " л" +
                ", цвет кузова - " + color +
                ", год выпуска = " + year +
                ", страна сборки - " + country +
                ", коробка передач - " + transmission +
                ", тип кузова - " + bodyType +
                ", регистрационный номер - " + registrationNumber +
                ", количество мест - " + capacity +
                ", " + (summerTyres?"летняя" : "зимняя") + " резина";

    }
    public static String validateString (String zeroValue){
        return (zeroValue == null || zeroValue.isBlank() || zeroValue.isEmpty()) ? "default" : zeroValue;
    }
    public static double validateEngineVolume (double zeroValue){
        return zeroValue <= 0 ? 1.5 : zeroValue;
    }
    public static Integer validateYear (Integer zeroValue){
        return zeroValue <= 0 ? 2000 : zeroValue;
    }
    public static String validateColor (String zeroValue){
        return (zeroValue == null || zeroValue.isBlank() || zeroValue.isEmpty()) ? "white" : zeroValue;
    }
    public static String validateTransmission (String zeroValue){
        return (zeroValue == null || zeroValue.isBlank() || zeroValue.isEmpty()) ? "МКПП" : zeroValue;
    }
    public static String validateBodyType (String zeroValue){
        return (zeroValue == null || zeroValue.isBlank() || zeroValue.isEmpty()) ? "Седан" : zeroValue;
    }
    public static String validateRegistrationNumber (String zeroValue){
        return (zeroValue == null || zeroValue.isBlank() || zeroValue.isEmpty()) ? "x000xх000" : zeroValue;
    }
    public static int validateCapacity (int zeroValue){
        return zeroValue <=0 ? 5 : zeroValue;
    }
    public void changeTyres (int month) {
        if ((month>=11 && month<=12) || (month>=1 && month<=3)) {
            summerTyres = false;
        }
        if (month>=4 && month<=10) {
            summerTyres= true;
        }
    }

}