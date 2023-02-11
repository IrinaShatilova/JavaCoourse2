package Transport;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver) {
        this.brand = validateString(brand);
        this.model = validateString(model);
        setEngineVolume(engineVolume);
        setDriver(driver);

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

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public static String validateString (String zeroValue){
        return (zeroValue == null || zeroValue.isBlank() || zeroValue.isEmpty()) ? "default" : zeroValue;
    }
    public static double validateEngineVolume (double zeroValue){
        return zeroValue <= 0 ? 1.5 : zeroValue;
    }
    public abstract void startMove ();
    public abstract void finishMove ();
    public abstract void printType ();
    public abstract void passDiagnostics () throws TransportTypeException;

    @Override
    public String toString() {
        return "Автомобиль: марка - " + brand +
                ", модель - " + model +
                ", объем двигателя - " + engineVolume +
                " л";

    }

}




