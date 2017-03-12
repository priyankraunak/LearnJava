
public class TwoDAgain {
    public static void main(String args[]){
        int d[][] = new int[4][];
        int i,j,k =0;
        d[0] = new int[1];
        d[1] = new int[2];
        d[2] = new int[3];
        d[3] = new int[4];
        for (i =0 ; i < 4; i++){
            for (j =0 ; j < i +1; j++){
                d[i][j] = k;
                k++;
            }
        }
        for (i = 0 ; i < 4; i++){
            for (j =0 ; j < i +1; j++){
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }


    }
}
