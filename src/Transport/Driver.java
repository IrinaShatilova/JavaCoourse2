package Transport;

import java.util.Objects;

public abstract class Driver {
    private String name;
    private boolean hasDriverLicense;
    private int experience;

    public Driver(String name, boolean hasDriverLicense, int experience) {
        this.name = name;
        this.hasDriverLicense = hasDriverLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMove ();
    public abstract void finishMove ();
    public abstract void refuelСar ();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return hasDriverLicense == driver.hasDriverLicense && experience == driver.experience && name.equals(driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hasDriverLicense, experience);
    }

    @Override
    public String toString() {
        return "Водитель: " +
                "Имя - " + name + ", наличие лицензии - " + hasDriverLicense +
                ", опыт вождения - " + experience + "лет";
    }
}
