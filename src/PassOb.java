
public class PassOb {
    public static void main(String args[]){
        Test t1 = new Test(10,120);
        Test t2 = new Test(10,120);
        Test t3 = new Test(1,2);

        System.out.println("t1 = t2 : " + t1.equalTo(t2));
        System.out.println("t2 = t3 : " + t2.equalTo(t3));
    }
}
