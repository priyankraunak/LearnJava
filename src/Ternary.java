
public class Ternary {
    public static void main(String args[]){
        int i = 10, k;
        k = i < 0 ? -i : i;
        System.out.println("i : " + i );
        System.out.println("absolute i : " + k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("i : " + i );
        System.out.println("absolute i : " + k);

    }
}
