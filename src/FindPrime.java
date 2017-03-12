
public class FindPrime {
    public static void main(String args[]){
        int num =21;
        boolean isPrime = false;
        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2 ; i <= num/i; i++){
            System.out.println(i + " " + num/i);
            if(num%i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("Prime number");
        else System.out.println("Not a prime");

    }
}
