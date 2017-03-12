

public class BoxDemo{
    public static void main(String args[]){
        Box myBox = new Box();
        double volume;
        myBox.depth = 10;
        System.out.println("depth " + myBox.depth);
        myBox.height = 20;
        myBox.width = 30;
        volume = myBox.depth * myBox.height * myBox.width;
        System.out.println("Box Volume " + volume);

    }
}