
public class BreakLoop {
    public static void main(String args[]){
        for(int i = 0 ; i < 100; i++){
            System.out.println("I : " + i);
            if(i == 10) break;
        }
    }
}
