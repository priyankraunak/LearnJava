package p1;

/**
 * Created by shashank on 12/03/17.
 */
public class Derived extends Protection{
    Derived(){
        System.out.println("Derived constructor");
        System.out.println("Default n: " + n );
        System.out.println("public n : " + n_pub);
        System.out.println("protected n : " + n_pro);
        //System.out.println("Private n : " + n_pri);
    }
}
