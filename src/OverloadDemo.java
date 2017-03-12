
public class OverloadDemo {
    void test(){
        System.out.println("No parameters");
    }

    void test(int a){
        System.out.println("a : " + a);
    }

    void test(int a, int b){
        System.out.println("a * b : " + a*b);
    }

    double test(double b){
        System.out.println("b : " + b);
        return b*b;
    }
}
