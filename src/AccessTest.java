
public class AccessTest {
    public static void main(String args[]){
        Test ob = new Test();
        ob.a = 10;
        ob.b = 20;
        //ob.c = 30;
        ob.setc(50);
        System.out.println("C value : " + ob.getc());

    }
}
