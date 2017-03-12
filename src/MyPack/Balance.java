package MyPack;

public class Balance {
    String name;
    double bal;

    public Balance(String a, double b){
        name = a;
        bal = b;
    }

    public void showBal(){
        if(bal < 0) System.out.print("----->");
        System.out.println(name + " : " + bal);
    }

}
