
public class Switch {
    public static void main(String args[]){
        int month = 4;
        switch(month){
            case 12:
            case 1 :
            case 2 :
                System.out.println("April is in Winter");
                break;
            case 3:
            case 4 :
            case 5:
                System.out.println("April is in Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("April is in Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("April is in Autumn");
                break;
            default:
                System.out.println("No match found");
        }
    }
}
