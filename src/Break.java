
public class Break {
    public static void main(String args[]){
        boolean b = true;
        first :{
            System.out.println("First block");
            second : {
                System.out.println("Second block");
                third : {
                    if(b) break second;
                    System.out.println("Not printed");
                }
                System.out.println("In second block");
            }
            System.out.println("In first block");
        }
    }
}
