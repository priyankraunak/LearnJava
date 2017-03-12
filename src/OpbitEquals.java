
public class OpbitEquals {
    public static void main(String args[]){
        int a = 1 , b = 2, c = 3;
        a <<= 1;
        System.out.println(" a : " + a );
        b >>= 1;
        System.out.println(" b : " + b );
        c |= 2;
        System.out.println(" c : " + c );
        b &= 2;
        System.out.println(" b : " + b );
        a ^= c;
        System.out.println(" a : " + a );
    }
}
