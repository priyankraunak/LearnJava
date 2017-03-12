
public class Menu {
    public static void main(String args[])
        throws java.io.IOException{
        char choice;
        do{
            System.out.println("Help on ? ");
            System.out.println("1. IF");
            System.out.println("2. switch");
            System.out.println("3. do-while");
            System.out.println("4. while");
            System.out.println("5. FOR");
            System.out.println("Choose one of the options");
            choice = (char) System.in.read();

        } while(choice < '1' || choice > '5');
        switch(choice){
            case '1':
                System.out.println("If description");
                break;
            case '2':
                System.out.println("Switch description");
                break;
            case '3':
                System.out.println("do-while description");
                break;
            case '4':
                System.out.println("while description");
                break;
            case '5':
                System.out.println("FOR description");
                break;
            default:
                System.out.println("NONE");
                break;
        }
    }

}
