/**
 * Created by shashank on 12/03/17.
 */
public class AbstractAreas {
    public static void main(String args[]){
        Figure f;
        Rectangle r = new Rectangle(3,4);
        Triangle t = new Triangle(5,6);

        f = r;
        System.out.println(f.area());

        f =t;
        System.out.println(f.area());
    }
}
