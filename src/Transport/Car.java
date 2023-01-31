package Transport;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int capacity;
    private boolean summerTyres;
    private Key key;
    public static class Key{
        private final boolean remoteRun;
        private final boolean withoutKey;
        public Key(boolean remoteRun, boolean withoutKey) {
            this.remoteRun = remoteRun;
            this.withoutKey = withoutKey;
        }
        public boolean isRemoteRun() {
            return remoteRun;
        }
        public boolean isWithoutKey() {
            return withoutKey;
        }

        @Override
        public String toString() {
            return (remoteRun?"удаленный запуск ДВС":"без удаленного запуска ДВС")
             + ", " + (withoutKey? "бесключевой доступ":"бесключевой доступ отсутствует");
        }
    }
    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               int speedMax,
               String transmission,
               String bodyType,
               String registrationNumber,
               int capacity,
               boolean summerTyres,
               Key key)  {
        super(brand,model,year,color,country,speedMax);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        this.bodyType = validateBodyType(bodyType);
        setRegistrationNumber(registrationNumber);
        this.capacity = validateCapacity(capacity);
        this.summerTyres = summerTyres;
        setKey(key);
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolume(engineVolume);
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
    public Key getKey() {
        return key;
    }
    public void setKey(Key key) {
        if (key ==null) {
            key = new Key(false,false);
        }
        this.key = key;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", объем двигателя = " + engineVolume + " л" +
                ", коробка передач - " + transmission +
                ", тип кузова - " + bodyType +
                ", регистрационный номер - " + registrationNumber +
                ", количество мест - " + capacity +
                ", " + (summerTyres?"летняя" : "зимняя") + " резина" +
                ", " + key;

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