
public class MissingBreak {
    public static void main(String args[]){
        for(int i =0 ; i < 12 ; i++){
            switch(i){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("I is less than 5 : "+ i);
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("I is between 5 and 9 : " +i);
                    break;
                default:
                    System.out.println("I is greater than 9 : "+ i);
            }
        }
    }
}
