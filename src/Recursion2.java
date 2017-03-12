
public class Recursion2 {
    public static void main(String args[]){
        RecTest r1 = new RecTest(10);
        for(int i = 0 ; i < 10 ; i++){
            r1.arr[i] = i;
        }
        r1.printArray(8);
    }
}
