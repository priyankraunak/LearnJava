
public class ForEach2 {
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i : nums){
            System.out.println("I : " + i);
            sum += i;
            if(i == 5) break;
        }
        System.out.println("Sum of 5 elements : " + sum);
    }
}
