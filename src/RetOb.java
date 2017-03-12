
public class RetOb {
    public static void main(String args[]){
        Test t1 = new Test(10);
        System.out.println(t1.a);
        Test t2 ;
        t2 = t1.incrByTen();
        System.out.println(t2.a);
        t2 = t2.incrByTen();
        System.out.println(t2.a);
    }
}
