/**
 * Created by shashank on 12/03/17.
 */
public class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }

    double area(){
        System.out.println("Triangle area");
        return d1*d2/2;
    }
}
