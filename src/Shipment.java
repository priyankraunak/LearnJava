
public class Shipment extends BoxEWeight{
    double cost;

    Shipment(){
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c){
        super(len,m);
        cost = c;
    }

    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double h, double d, double wt, double c){
        super(w,h,d,wt);
        cost = c;
    }
}
