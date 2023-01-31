import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car (
                "Lada",
                "   ",
                1.7,
                "",
                0,
                "Russia",
                "МКПП",
                "седан",
                "в555вв55",
                5,
                true
        );
        Car audiA8 = new Car (
                "Audi",
                "A8",
                0,
                "black",
                2020,
                "Germany",
                "АКПП",
                "седан",
                "",
                7,
                true);
        Car bmvZ8 = new Car (
                "BMV",
                "Z8",
                3.0,
                "black",
                2021,
                "Germany",
                "АКПП",
                "седан",
                "",
                7,
                false);
        Car kiaSportage = new Car (
                "Kia",
                "Sportage 4-го поколения",
                2.4,
                "red",
                2018,
                "South Korea",
                "",
                "седан",
                "f222dd99",
                7,
                true);
        Car hyundaiAvante = new Car (
                "Hyundai",
                "Avante",
                1.6,
                "orange",
                2016,
                "South Korea",
                "АКПП",
                " ",
                "",
                7,
                true);
        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmvZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
        hyundaiAvante.changeTyres(12);
        System.out.println(hyundaiAvante);
    }
}
