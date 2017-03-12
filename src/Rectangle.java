/**
 * Created by shashank on 12/03/17.
 */
public class Rectangle extends Figure {
    Rectangle(double a, double b){
        super(a,b);
    }

    double area(){
        System.out.println("Area of rectangle");
        return d1*d2;
    }

}
