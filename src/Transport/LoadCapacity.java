package Transport;

public enum LoadCapacity {
    N1("до 3,5 тонн"),
    N2("от 3,5 до 12 тонн"),
    N3("свыше 12 тонн");
    private String loadCapaciti;
    LoadCapacity(String loadCapaciti) {
        this.loadCapaciti = loadCapaciti;
    }
    public String getLoadCapaciti() {
        return loadCapaciti;
    }

    @Override
   public String toString() {
       return "Грузоподъемность: " + getLoadCapaciti();
    }
}
