
public class VarArgs {
    static void vaArr(int ... v){
        System.out.print("No of arguments passed : " + v.length + " : contents -> ");
        for (int i : v ){
            System.out.print(" "+i);
        }
        System.out.println();
    }

    public static void main(String args[]){
        vaArr(10);
        vaArr(1,2,3);
        vaArr();
    }
}
