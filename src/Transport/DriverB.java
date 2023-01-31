package Transport;

public class DriverB extends Driver {
    public DriverB(
            String name,
            boolean hasDriverLicense,
            int experience) {
        super(name, hasDriverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории В " + getName() + " начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории В " + getName() + " закончил движение");
    }

    @Override
    public void refuelСar() {
        System.out.println("Водитель категории В " + getName() + " заправляет авто");
    }
}
