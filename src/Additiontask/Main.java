package Additiontask;

public class Main {
    public static void main(String[] args) {

        Address address = new Address();

        address.setIndex("6261");
        address.setCountry("Danmark");
        address.setCity("Bredebro");
        address.setStreet("Håndværkervej");
        address.setHouse("6");
        address.setApartment("6");

        System.out.println(address.getIndex() + ", " + address.getCountry() + ", " + address.getCity() + ", " + address.getStreet() + ", "
                + address.getHouse() + ", " + address.getApartment());

    }
}
