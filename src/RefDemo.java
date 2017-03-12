
public class RefDemo {
    public static void main(String args[]){
        BoxWeight subbox = new BoxWeight(1,2,34,5);
        Box supbox = new Box();

        System.out.println("Weight of sub box : " + subbox.weight);
        System.out.println("Volume of sub box : " + subbox.volume());

        supbox = subbox;

        System.out.println("Volume of super box : " + supbox.volume());
    }
}
