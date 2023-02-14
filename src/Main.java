import Transport.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Mechanic mechanicVasya = new Mechanic("Василий Петров","Евразия");
        Mechanic mechanicOleg = new Mechanic("Олег Александров","Европа");
        Mechanic mechanicMaxim = new Mechanic("Максим Ветров","Евразия");

        DriverB driverB1 = new DriverB("Иванов ИИ",true,20);
        Car ladaGranta = new Car (
                "Lada",
                "",
                1.7,
                driverB1,List.of(mechanicVasya),BodyType.SEDAN

        );
        DriverB driverB2 = new DriverB("Петров ПП",true,15);
        Car audiA8 = new Car (
                "Audi",
                "A8",
                0,
                driverB2,List.of(mechanicOleg),BodyType.SEDAN
        );

        System.out.print(ladaGranta + "  ");
        ladaGranta.printType();
        System.out.print(audiA8 + "  ");
        audiA8.printType();

        DriverD driverD1 = new DriverD("Алехин ВВ",true,10);
        Bus liaz5256 = new Bus(
                "ЛиАЗ",
                "5256",
                5.0,
                driverD1,List.of(mechanicMaxim,mechanicVasya),Size.AVERAGE
                );
        DriverD driverD2 = new DriverD("Володин ВВ",true,10);
        Bus paz3205 = new Bus(
                "ПАЗ",
                "3205",
                6,
                driverD2,List.of(mechanicOleg),
                Size.ESPECIALLYSMALL);

        System.out.print(liaz5256 + "  ");
        liaz5256.printType();
        System.out.print(paz3205 + " ");
        paz3205.printType();

        DriverC driverC1 = new DriverC ("Кошкин ВВ",true,10);
        Truck truck1 = new Truck(
                "Грузовик ",
                "1",
                10.0,
                driverC1,List.of(mechanicOleg),
                LoadCapacity.N3);
        DriverC driverC2 = new DriverC ("Мышкин СС",true,10);
        Truck truck2 = new Truck(
                "Грузовик ",
                "2",
                10.0,
                driverC2,List.of(mechanicMaxim,mechanicVasya),
                LoadCapacity.N3);

        System.out.print(truck1 + "  ");
        truck1.printType();
        System.out.print (truck2 + "  ");
        truck2.printType();
        truck1.passDiagnostics();

        List<Transport> mayTransport = new ArrayList<>();
        mayTransport.add(ladaGranta);
        mayTransport.add(audiA8);
        mayTransport.add(liaz5256);  // автобус
        mayTransport.add(paz3205);   // автобус
        mayTransport.add(truck1);
        mayTransport.add(truck2);

        System.out.println(mayTransport);

        Queue<Transport> transportSTO = new ArrayDeque<>();
        ServiceStation sto = new ServiceStation(transportSTO);
        for (Transport transport : mayTransport) {
            sto.addTransport(transport);
        }
        printInfo(ladaGranta);
        printInfo(audiA8);

        printInfo(liaz5256);
        printInfo(paz3205);

        printInfo(truck1);
        printInfo(truck2);

}
    public static void printInfo(Transport<?> transport){
        System.out.println("Водитель " + transport.getDriver().getName()
                + " управляет автомобилем " + transport.getBrand() + transport.getModel()
                + " и будет участвовать в заезде" + ", закрепленный(ые) механик(и)-" + transport.getMechanicList());
    }

}
