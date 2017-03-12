
public class MultByTwo {
    public static void main(String args[]){
        int i , num = 0XFFFFFFE;
        for (i = 0 ; i < 4 ; i++){
            num = num << i;
            System.out.println("Num : " + num);
        }
    }
}
