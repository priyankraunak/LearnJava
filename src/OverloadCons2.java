
public class OverloadCons2 {
    public static void main(String args[]){
        Box box1 = new Box();
        Box box2 = new Box(1,2,3);
        Box box3 = new Box(5);
        Box box4 = new Box(box3);

        System.out.println("BOX 1 volume : " + box1.volume());
        System.out.println("BOX 2 volume : " + box2.volume());
        System.out.println("BOX 3 volume : " + box3.volume());
        System.out.println("BOX 4 volume : " + box4.volume());
    }
}
