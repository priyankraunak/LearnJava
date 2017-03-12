
public class CallByValue {
    public static void main(String args[]){
        int a = 10, b = 20;
        Test t1 = new Test();
        t1.meth(a,b);
        System.out.println(a + " "+ b);
    }
}
