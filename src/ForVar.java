
public class ForVar {
    public static void main(String args[]){
        int i = 0;
        boolean b = false;
        for (;!b;){
            System.out.println("I : " + i);
            if(i == 10) b = true;
            i++;
        }
    }

}
