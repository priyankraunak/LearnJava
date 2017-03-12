
public class Search {
    public static void main(String args[]){
        int nums[] = {5,4,2,6,7,8,10,11};
        int val = 4;
        boolean found = false;
        for(int i : nums){
            if(i == val){
                found = true;
                break;
            }
        }
        if(found) System.out.println("Found");
        else System.out.println("Not found");
    }
}
