
public class BoxE {
    private double width;
    private double height;
    private double depth;

    BoxE(){
        width = -1;
        height = -1;
        depth = -1;
    }

    BoxE(double len){
        width = height = depth = len;
    }

    BoxE(BoxE ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    BoxE(double w, double d, double h){
        width = w;
        depth =d;
        height = h;
    }

    double volume(){
        return width*depth*height;
    }
}
