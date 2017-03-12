
public class StringSwitch {
    public static void main(String args[]){
        String a = "two";
        switch(a){
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("Three");
                break;
            default :
                System.out.println("no match");
                break;
        }
    }
}
