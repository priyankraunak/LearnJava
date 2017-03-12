
public class CallByRef {
    public static void main(String args[]){
        Test t1 = new Test(10,20);
        System.out.println(t1.a + " " + t1.b);
        t1.meth(t1);
        System.out.println(t1.a + " " + t1.b);
    }
}
