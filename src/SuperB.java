
public class SuperB extends SuperA1 {
    int c ;
    SuperB(int a, int b, int k){
        super(a,b);
        c = k;
    }

    //void show(){
        //super.show();
        //System.out.println("c : " + c);
    //}

    void show(String msg){
        System.out.println(msg);
        System.out.println("k : " + c);
    }
}
