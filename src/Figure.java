/**
 * Created by shashank on 12/03/17.
 */
abstract class Figure {
    double d1;
    double d2;

    Figure(double a, double b){
        d1 = a;
        d2 = b;
    }

    //double area(){
        //System.out.println("Not determined in this class");
        //return 0;
    //}
    abstract  double area();
}
