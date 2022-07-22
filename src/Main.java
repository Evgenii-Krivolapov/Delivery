public class Main {
    public static void main(String[] args) {
        Delivery delivery = new Delivery();
        delivery.setWeight("20 кг");
        delivery.setWeight("30 кг");
        delivery.setAdress("Prospect Lenina 78");
        delivery.setNumber("456854786");
        System.out.println(delivery);
        Delivery copy = new Delivery(delivery.getFragileCargo(), delivery.getCanting());

        Dimensions dimensions = new Dimensions();
        dimensions.setHeight("20 см.");
        dimensions.setHeight("30 см.");
        dimensions.setWidth("40 см.");
        dimensions.setLength("70 см.");
        System.out.println(dimensions);
    }
}
