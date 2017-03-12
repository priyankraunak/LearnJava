/**
 * Created by shashank on 12/03/17.
 */
public class Dispatch {
    public static void main(String args[]){
        DynA a = new DynA();
        DynB b = new DynB();
        DynC c = new DynC();

        a.callMe();
        b.callMe();
        c.callMe();

        a = b;
        a.callMe();

        a = c;
        a.callMe();

    }
}
