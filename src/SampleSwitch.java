
public class SampleSwitch {
    public static void main(String args[]){
        for (int i = 0 ; i < 6 ; i++){
            switch(i){
                case 0:
                    System.out.println("i : " + i);
                    break;
                case 1:
                    System.out.println("i : " + i);
                    break;
                case 2:
                    System.out.println("i : "+ i);
                    break;
                default:
                    System.out.println("I is greater than 2 : " + i);
            }
        }
    }
}
