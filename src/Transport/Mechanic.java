package Transport;

import static Transport.Transport.validateString;

public class Mechanic {
    private String nameMechanic;
    private String nameCompany;

    public Mechanic(String nameMechanic, String nameCompany) {
        this.nameMechanic = validateString(nameMechanic);
        this.nameCompany = validateString(nameCompany);
    }

    public String getNameMechanic() {
        return nameMechanic;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameMechanic(String nameMechanic) {
        this.nameMechanic = nameMechanic;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    @Override
    public String toString() {
        return nameMechanic +
                " из компании " + nameCompany;
    }
    public <T extends Transport> void performMaintenance(T t) {
        System.out.println(t.toString() + ", техобслуживание провел " + this);

    }
    public <T extends Transport> void repairTransport(T t) {
        System.out.println(t.toString() + ", ремонт выполнил " + this);

    }

}
