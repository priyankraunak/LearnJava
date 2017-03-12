package p2;

/**
 * Created by shashank on 12/03/17.
 */
public class OtherPackage {
    OtherPackage(){
        p1.Protection p = new p1.Protection();

        System.out.println("Other package instance constructor");
        //System.out.println("Default n: " + p.n );
        System.out.println("public n : " + p.n_pub);
        //System.out.println("protected n : " + p.n_pro);

    }
}
