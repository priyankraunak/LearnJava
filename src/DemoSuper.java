public class DemoSuper {
    public static void main(String  args[]){
        BoxEWeight bw1 = new BoxEWeight();
        BoxEWeight bw2 = new BoxEWeight(10,2);
        BoxEWeight bw3 = new BoxEWeight(1,2,3,4);
        BoxEWeight bw4 = new BoxEWeight(bw3);

        System.out.println("Box 1 weight : " + bw1.weight);
        System.out.println("Box 1 volume : " + bw1.volume());
        System.out.println("Box 2 weight : " + bw2.weight);
        System.out.println("Box 2 volume : " + bw2.volume());
        System.out.println("Box 3 weight : " + bw3.weight);
        System.out.println("Box 3 volume : " + bw3.volume());
        System.out.println("Box 4 weight : " + bw4.weight);
        System.out.println("Box 4 volume : " + bw4.volume());
    }
}
