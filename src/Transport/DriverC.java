package Transport;

public class DriverC extends Driver {
    public DriverC(
            String name,
            boolean hasDriverLicense,
            int experience) {
        super(name, hasDriverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории C " + getName() + " начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории C " + getName() + " закончил движение");
    }

    @Override
    public void refuelСar() {
        System.out.println("Водитель категории C " + getName() + " заправляет авто");
    }
}