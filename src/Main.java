import Transport.*;

public class Main {
    public static void main(String[] args) {
        DriverB driverB1 = new DriverB("Иванов ИИ",true,20);
        Car ladaGranta = new Car (
                "Lada",
                "   ",
                1.7,
                driverB1,null
        );
        DriverB driverB2 = new DriverB("Петров ПП",true,15);
        Car audiA8 = new Car (
                "Audi",
                "A8",
                0,
                driverB2,BodyType.SEDAN
        );
        DriverB driverB3 = new DriverB("Антонов АА",true,20);
        Car bmvZ8 = new Car (
                "BMV",
                "Z8",
                3.0,
                driverB3,BodyType.MINIVAN
        );
        DriverB driverB4 = new DriverB("Семенов СС",true,18);
        Car kiaSportage = new Car (
                "Kia",
                "Sportage 4-го поколения",
                2.4,
                driverB4,BodyType.MINIVAN
        );


        System.out.print(ladaGranta + "  ");
        ladaGranta.printType();
        System.out.print(audiA8 + "  ");
        audiA8.printType();
        System.out.print(bmvZ8 + "  ");
        bmvZ8.printType();
        System.out.print(kiaSportage+ "  ");
        kiaSportage.printType();

        DriverD driverD1 = new DriverD("Алехин ВВ",true,10);
        Bus liaz5256 = new Bus(
                "ЛиАЗ",
                "5256",
                5.0,
                driverD1,Size.AVERAGE
                );
        DriverD driverD2 = new DriverD("Володин ВВ",true,10);
        Bus paz3205 = new Bus(
                "ПАЗ",
                "3205",
                6,
                driverD2,
                Size.ESPECIALLYSMALL);
        DriverD driverD3 = new DriverD("Коровин КК",true,10);
        Bus volvo9500 = new Bus(
                "Volvo",
                "9500",
                4.5,
                driverD3,
                Size.ESPECIALLYLARGE);
        DriverD driverD4 = new DriverD("Александров ТТ",true,10);
        Bus volvo0000 = new Bus(
                "Volvo",
                " ",
                5.0,
                driverD4,
                Size.SMALL);

        System.out.print(liaz5256 + "  ");
        liaz5256.printType();
        System.out.println(volvo9500);
        System.out.println(volvo0000);
        System.out.println(paz3205);
        DriverC driverC1 = new DriverC ("Кошкин ВВ",true,10);
        Truck truck1 = new Truck(
                "Грузовик ",
                "1",
                10.0,
                driverC1,
                LoadCapacity.N3);
        DriverC driverC2 = new DriverC ("Мышкин СС",true,10);
        Truck truck2 = new Truck(
                "Грузовик ",
                "2 ",
                10.0,
                driverC2,
                LoadCapacity.N3);
        DriverC driverC3 = new DriverC ("Ложкин ЛЛ",true,10);
        Truck truck3 = new Truck(
                "Грузовик ",
                "3 ",
                15.0,
                driverC3,
                LoadCapacity.N3);
        System.out.print(truck1 + "  ");
        truck1.printType();
        System.out.println(truck2);
        System.out.println(truck3);

        printInfo(ladaGranta);
        printInfo(audiA8);
        printInfo(kiaSportage);
        printInfo(bmvZ8);
        printInfo(liaz5256);
        printInfo(volvo9500);
        printInfo(volvo0000);
        printInfo(paz3205);
        printInfo(truck1);
        printInfo(truck2);
        printInfo(truck3);
    }

    public static void printInfo(Transport<?> transport){
        System.out.println("Водитель " + transport.getDriver().getName()
                + " управляет автомобилем " + transport.getBrand() + transport.getModel()
                + " и будет участвовать в заезде");
    }

}
