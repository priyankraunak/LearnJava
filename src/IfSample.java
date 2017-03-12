
public class IfSample {
    public static void main(String args[]){
        int x,y ;
        x = 10;
        y = 20;
        if (x < y) System.out.println("X is less than y");
        x *= 2;
        if (x == y) System.out.println("x is now equal to y");
        x += 10;
        if (x > y) System.out.println("x is now greater than y");
        if (x == y) System.out.println("this won't be printed");
    }
}
