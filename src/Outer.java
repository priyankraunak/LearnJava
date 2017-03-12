
public class Outer {
    int outer_x = 10;

    void test(){
        for( int i = 0 ; i < 10 ; i++){
            class Inner{
                void display(){
                    System.out.println("Outer X : " + outer_x);
                }
            }
            Inner inn = new Inner();
            inn.display();
        }

    }
}
