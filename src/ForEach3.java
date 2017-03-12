
public class ForEach3 {
    public static void main(String args[]){
        int nums[][] = new int[3][4];
        int sum = 0;
        for (int a = 0 ; a < 3; a++){
            for(int b =0 ; b < 4 ; b++){
                nums[a][b] = (a+1)*(b+1);
            }
        }
        for(int a[] : nums){
            for(int b : a){
                System.out.println("Value : " + b);
                sum += b;
            }
        }
        System.out.println("Summation : " + sum );
    }

}
