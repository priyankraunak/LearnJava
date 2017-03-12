
public class BoxEWeight extends BoxE{
    double weight;

    BoxEWeight(){
        super();
        weight = -1;
    }

    BoxEWeight(double len,double w){
        super(len);
        weight = w;
    }

    BoxEWeight(BoxEWeight ob1){
        super(ob1);
        weight = ob1.weight;
    }

    BoxEWeight(double w, double h, double d,double wt){
        super(w,d,h);
        weight = wt;
    }
}
