
public class Scope {
    public static void main(String args[]){
        int x = 10;
        if (x == 10){
            int y = 20;
            System.out.println("X and Y are : " + x + " " + y);
        }
        //y = 30;
        x = 40;
        System.out.println("X = "+x);
    }
}
