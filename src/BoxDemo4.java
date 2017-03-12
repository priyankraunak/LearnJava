
public class BoxDemo4 {
    public static void main(String args[]){
       Box box1 = new Box();
        Box box2 = new Box();
        //double vol;
        box1.depth = 1;
        box1.height = 2;
        box1.width = 3;
        box2.depth = 4;
        box2.width = 5;
        box2.height = 6;
        //vol = box1.volume();
        System.out.println("Volume of first box : " + box1.volume() );
        //vol = box2.volume();
        System.out.println("Volume of second box : " + box2.volume() );

    }
}
