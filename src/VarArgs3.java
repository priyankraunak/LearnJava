
public class VarArgs3 {
    static void va(int i){
        System.out.println("Single parameter : " + i);
    }

    static void va(int ... i){
        System.out.print("No of integer arguments : " + i.length + " : contents -> ");
        for(int a : i){
            System.out.print(" " + a);
        }
        System.out.println();
    }

    static void va(boolean ... i){
        System.out.print("No of boolean arguments : " + i.length + " : contents -> ");
        for(boolean a : i){
            System.out.print(" " + a);
        }
        System.out.println();
    }

    static void va(String b , int ... i){
        System.out.print(b + i.length + " : contents -> ");
        for(int a : i){
            System.out.print(" " + a);
        }
        System.out.println();
    }

    public static void main(String args[]){
        va(1);
        va(1,2,3,4);
        va(true,true,false,false);
        va("int array ",5,67,6);
        //va();
    }
}
