package p2;

/**
 * Created by shashank on 12/03/17.
 */
public class Protection2 extends p1.Protection{
    Protection2(){
        System.out.println("Other package subclass");
        //System.out.println("Default n: " + n );
        System.out.println("public n : " + n_pub);
        System.out.println("protected n : " + n_pro);
    }
}
