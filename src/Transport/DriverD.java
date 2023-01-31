package Transport;

public class DriverD extends Driver{
    public DriverD(
            String name,
            boolean hasDriverLicense,
            int experience) {
        super(name, hasDriverLicense, experience);
    }
    @Override
    public void startMove() {
        System.out.println("Водитель категории Д " + getName() + " начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории Д " + getName() + " закончил движение");
    }

    @Override
    public void refuelСar() {
        System.out.println("Водитель категории Д " + getName() + " заправляет авто");
    }
}
