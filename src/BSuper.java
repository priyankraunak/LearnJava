
public class BSuper extends ASuper{
    int i;

    BSuper(int a, int b){
        super.i = a;
        i = b;
    }

    void meth(){
        System.out.println("Super : " + super.i);
        System.out.println("I : " + i);
    }
}
