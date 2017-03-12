
public class BoxDemo5 {
    public  static void main(String args[]){
        Box box1 = new Box();
        Box box2 = new Box();

        box1.setDim(1,2,3);
        box2.setDim(4,5,6);

        System.out.println("BOX 1 volume : " + box1.volume());
        System.out.println("BOX 2 volume : " + box2.volume());

    }
}
