public class BoxDemo2{
    public static void main(String args[]){
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double volume1;
        double volume2;
        myBox1.depth = 10;
        myBox1.height = 20;
        myBox1.width = 30;
        volume1 = myBox1.depth * myBox1.height * myBox1.width;
        System.out.println("Box1 Volume " + volume1);
        myBox2.depth = 15;
        myBox2.height = 25;
        myBox2.width = 35;
        volume2 = myBox2.depth*myBox2.width*myBox2.height;
        System.out.println("Box2 volume : " + volume2);

    }
}
