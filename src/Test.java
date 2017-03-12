
public class Test {
    int a;
    public int b;
    private int c;

    Test(int i, int j){
        a = i;
        b = j;
    }

    Test(){

    };

    Test(int i){
        a = i;
    }

    void meth(int i, int j){
        i *= 2;
        j /= 2;
    }

    void meth(Test ob){
        ob.a *= 2;
        ob.b /= 2;
    }

    void setc(int i){
        c = i;
    }

    int getc(){
       return c;
    }

    Test incrByTen(){
        Test temp = new Test(a + 10);
        return temp;
    }

    boolean equalTo(Test ob){
        if(ob.a == a && ob.b == b ) return true;
        else return false;
    }
}
