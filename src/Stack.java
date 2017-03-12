
class Stack {
    int stck[] = new int[10];
    int i ;

    Stack(){
        i = -1;
    }

    void push(int val){
        if(i >= 9) System.out.println("Stack overflow");
        else stck[++i] = val;
    }

    int pop(){
        if(i < 0) {
            System.out.println("Stack underflow");
            return -1;
        }
        else return stck[i--];
    }

}
