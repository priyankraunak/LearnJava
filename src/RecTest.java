
public class RecTest {
    int arr[];

    RecTest(int i){
        arr = new int[i];
    }

    void printArray(int i){
        if(i == 0) return;
        else  printArray(i-1);
        System.out.println("["+(i-1)+"] : "+arr[i-1]);
    }
}
