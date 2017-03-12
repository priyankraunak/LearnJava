import java.lang.*;

/**
 * Created by shashank on 12/03/17.
 */
public class AbstractDemo {
    public static void main(String args[]){
        AbsA a ;
        AbsB b = new AbsB();
        //a.callMe();
        //a.supCallMe();
        b.callMe();
        b.supCallMe();
        a = b;
        a.supCallMe();
        a.callMe();
    }
}
