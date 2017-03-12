
public class Average {
    public static void main(String args[]){
        int i;
        double val[] = {10.1,10.2,10.3,10.4,10.5};
        double avg = 0;
        for (i=0; i < 5; i++){
            avg += val[i];
            System.out.println("Average is : " + avg/5);
        }

    }
}
