
public class Matrix {
    public static void main(String args[]){
        int d[][] = {
                {0*0,0*1,0*2},
                {1*0,1*1,1*2},
                {2*0,2*1,2*2}
                };
        int i,j;
        for (i =0 ;i <3;i++){
            for (j =0 ;j <3; j++) System.out.print(d[i][j] + " ");
            System.out.println();
        }

    }
}
