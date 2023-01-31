import Transport.Bus;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car (
                "Lada",
                "   ",
                1.7
        );
        Car audiA8 = new Car (
                "Audi",
                "A8",
                0
        );
        Car bmvZ8 = new Car (
                "BMV",
                "Z8",
                3.0
        );
        Car kiaSportage = new Car (
                "Kia",
                "Sportage 4-го поколения",
                2.4
        );

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmvZ8);
        System.out.println(kiaSportage);

        Bus liaz5256 = new Bus(
                "ЛиАЗ",
                "5256",
                5.0);
        Bus paz3205 = new Bus(
                "ПАЗ",
                "3205",
                6);
        Bus volvo9500 = new Bus(
                "Volvo",
                "9500",
                4.5);
        Bus volvo0000 = new Bus(
                "Volvo",
                " ",
                5.0);
        System.out.println(liaz5256);
        System.out.println(volvo9500);
        System.out.println(volvo0000);
        System.out.println(paz3205);
        Truck truck1 = new Truck(
                "Грузовик ",
                "1",
                10.0
        );
        Truck truck2 = new Truck(
                "Грузовик ",
                "2 ",
                10.0
        );
        Truck truck3 = new Truck(
                "Грузовик ",
                "3 ",
                15.0
        );
        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
    }
}
