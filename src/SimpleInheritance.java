
public class SimpleInheritance {
    public static void main(String args[]){
        A a = new A();
        B b = new B();

        a.showij();
        a.i = 10;
        a.j = 20;
        a.showij();

        b.k = 30;
        b.showij();
        b.i = 15;
        b.j = 25;
        b.showij();
        b.showk();
        b.sumall();

    }
}
