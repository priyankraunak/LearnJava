
public class DemoShipment {

    public static void main(String args[]){

        Shipment sh1 = new Shipment(1,2,3,4,5);
        Shipment sh2 = new Shipment(6,7,8,9,10);

        System.out.println("Shipment 1 : " + sh1.weight);
        System.out.println("Shipment 1 : " + sh1.cost);
        System.out.println("Shipment 1 : " + sh1.volume());

        System.out.println("Shipment 2 : " + sh2.weight);
        System.out.println("Shipment 2 : " + sh2.cost);
        System.out.println("Shipment 2 : " + sh2.volume());

    }

}
