
public class OverloadCons {
    public static void main(String args[]){
        Box box1 = new Box();
        Box box2 = new Box(10);
        Box box3 = new Box(1,2,3);
        box1.width = 4;
        box1.depth = 5;
        box1.height = 6;

        System.out.println("Box1 volume : " + box1.volume());
        System.out.println("Box1 volume : " + box2.volume());
        System.out.println("Box1 volume : " + box3.volume());
    }
}
