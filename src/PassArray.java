
public class PassArray {
    static void vaArray(int va[]){
        System.out.print("No of arguments : " + va.length + " : Contents -> ");
        for (int x : va){
            System.out.print(" " + x);

        }
        System.out.println();
    }

    public static void main(String args[]){
        int a[] = {};
        int b[] = {1,2,3};
        int c[] = {1};
        vaArray(a);
        vaArray(b);
        vaArray(c);
    }
}
