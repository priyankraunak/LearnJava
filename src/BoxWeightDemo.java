
public class BoxWeightDemo {
    public static void main(String args[]){
        BoxWeight b1 = new BoxWeight(1,2,3,4);
        BoxWeight b2 = new BoxWeight(5,6,7,8);

        System.out.println("Box 1 weight : " + b1.weight);
        System.out.println("Box 1 volume : " + b1.volume());
        System.out.println("Box 2 weight : " + b2.weight);
        System.out.println("Box 2 volume : " + b2.volume());

    }
}
