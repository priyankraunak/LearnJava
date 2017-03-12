
public class BoxDemo3 {
    public static void main(String args[]){
        Box box1 = new Box();
        Box box2 = new Box();
        box1.depth = 1;
        box1.height = 2;
        box1.width = 3;
        box2.depth = 4;
        box2.width = 5;
        box2.height = 6;
        box1.volume();
        box2.volume();
    }
}
