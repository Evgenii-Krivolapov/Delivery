public class Main {
    public static void main(String[] args) {
        Delivery delivery = new Delivery();
        delivery.setWeight("20 ��");
        delivery.setWeight("30 ��");
        delivery.setAdress("Prospect Lenina 78");
        delivery.setNumber("456854786");
        System.out.println(delivery);
        Delivery copy = new Delivery(delivery.getFragileCargo(), delivery.getCanting());

        Dimensions dimensions = new Dimensions();
        dimensions.setHeight("20 ��.");
        dimensions.setHeight("30 ��.");
        dimensions.setWidth("40 ��.");
        dimensions.setLength("70 ��.");
        System.out.println(dimensions);
    }
}
