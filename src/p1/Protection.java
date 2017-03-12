package p1;
/**
 * Created by shashank on 12/03/17.
 */
public class Protection {
    int n = 1;
    public int n_pub =  2;
    protected int n_pro = 3;
    private int n_pri = 4;

    public Protection(){
        System.out.println("Base constructor");
        System.out.println("Default n : " + n);
        System.out.println("public n : " + n_pub);
        System.out.println("protected n : " + n_pro);
        System.out.println("private n : " + n_pri);

    }
}
