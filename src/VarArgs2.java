
public class VarArgs2 {
    static void va(String a, int ... v){
        System.out.print(a + " " + v.length + " : Contents -> ");
        //for()
        for (int i : v ){
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void main(String args[]){
        va("one argument",234);
        va("No argument");
        va("three arguments", 1,2,3);
    }
}
