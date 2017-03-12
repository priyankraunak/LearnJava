package MyPack;

/**
 * Created by shashank on 12/03/17.
 */
public class AccountBalance {
    public static void main(String args[]){
        Balance b[] = new Balance[3];

        b[0] = new Balance("priyank",-1000000);
        b[1] = new Balance("shashank",20000000);
        b[2] = new Balance("ravi",300000000);

        for (int i = 0 ; i<3 ; i++) b[i].showBal();

    }
}
