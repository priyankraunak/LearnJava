
public class StringDemo3 {
    public static void main(String args[]){
        String str[] = {"one","two","three"};//= new String[3];
        //str[0] = "one";
        for(int i = 0 ; i < str.length ; i++){
            System.out.println("str["+i+"] : " + str[i]);
        }
    }
}
