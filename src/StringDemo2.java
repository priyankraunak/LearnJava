
public class StringDemo2 {
    public static void main(String args[]){
        String s1 = "first";
        String s2 = "second";
        String s3 = s1;

        System.out.println("S1 length : " + s1.length());
        System.out.println("Char at index 3 of s1 : " + s1.charAt(3));
        if(s1.equals(s2)) System.out.println("s1 equal to s2");
        else System.out.println("s1 not equal to s2");
        if(s1.equals(s3)) System.out.println("s1 equal to s3");
        else System.out.println("s1 not equal to s3");

    }
}
