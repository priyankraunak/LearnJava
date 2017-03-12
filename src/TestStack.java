
public class TestStack {
    public static void main(String args[]){
        Stack stk1 = new Stack();
        Stack stk2 = new Stack();

        for(int i = 0 ; i < 15 ; i++){
            //System.out.println(i);
            stk1.push(i);
        }
        for(int j = 10 ; j < 25 ; j++){
            stk2.push(j);
        }

        for (int a = 0 ;a < 12; a++) System.out.println(stk1.pop());
        for (int b =0 ; b< 12 ; b++) System.out.println(stk2.pop());

    }
}
