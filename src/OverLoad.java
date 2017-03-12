
public class OverLoad {
    public static void main(String args[]){
        OverloadDemo od = new OverloadDemo();
        double result;
        od.test();
        od.test(5);
        od.test(3,6);
        result = od.test(10.1);
        System.out.println("od.test(10.1) : " + result);
    }
}
