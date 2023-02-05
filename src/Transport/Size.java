package Transport;

public enum Size {

    ESPECIALLYSMALL("до 10 "),
    SMALL("от 10 до 25 "),
    AVERAGE("от 25 до 50 "),
    LARGE("от 50 до 80 "),
    ESPECIALLYLARGE("от 80 до 120 ");

    private String size;

    Size(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Вместимость (количество мест): " + getSize();
    }
}
