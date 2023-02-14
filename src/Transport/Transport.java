package Transport;
import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private List<Mechanic> mechanicList;
    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver, List<Mechanic> mechanicList) {
        this.brand = validateString(brand);
        this.model = validateString(model);
        setEngineVolume(engineVolume);
        setDriver(driver);
        this.mechanicList = mechanicList;


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

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }
    public void setMechanicList(List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
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

    public boolean checkTransportNeedService() {
        try {passDiagnostics();
        } catch (TransportTypeException e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Автомобиль: марка - " + brand +
                ", модель - " + model +
                ", объем двигателя - " + engineVolume +
                " л";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model) && driver.equals(transport.driver) && mechanicList.equals(transport.mechanicList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver, mechanicList);
    }
}




