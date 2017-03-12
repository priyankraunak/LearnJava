package p1;

/**
 * Created by shashank on 12/03/17.
 */
public class SamePackage {
    SamePackage(){
        Protection p = new Protection();
        System.out.println("Same package constructor");
        System.out.println("Default n: " + p.n );
        System.out.println("public n : " + p.n_pub);
        System.out.println("protected n : " + p.n_pro);
        //System.out.println("Private n : " + p.n_pri);
    }
}
