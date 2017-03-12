
public class Conversion {
    public static void main(String args[]){
        int a = 257;
        byte b;
        double c = 323.142;
        System.out.println("\nConversion to int to byte");
        b = (byte) a;
        System.out.println("Value of b is : " + b);
        System.out.println("\nConversion of double to int");
        a = (int) c;
        System.out.println("Value of a is : " + a);
        System.out.println("\nConversion of double to byte");
        b = (byte) c;
        System.out.println("value of b is : " + b);
    }
}
