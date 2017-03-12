
public class BreakLoop2 {
    public static void main(String args[]){
        int i = 0;
        while(i < 100){
            System.out.println("I : " + i );
            i++;
            if(i == 10) break;
        }
    }
}
