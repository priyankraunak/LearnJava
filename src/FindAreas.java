/**
 * Created by shashank on 12/03/17.
 */
public class FindAreas {
    public static void main(String args[]){
        Figure f; //= new Figure(1,2);
        Rectangle r = new Rectangle(3,4);
        Triangle t = new Triangle(4,5);
        Figure fref;

        fref = r;
        System.out.println(fref.area());

        fref = t;
        System.out.println(fref.area());

        //fref = f;
        System.out.println(fref.area());


    }
}
