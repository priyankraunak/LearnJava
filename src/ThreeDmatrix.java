
public class ThreeDmatrix {
    public static void main(String args[]){
        double d[][][] = new double[2][3][4];
        int i,j,k;
        for (i = 0; i < 2; i++){
            for (j = 0 ; j < 3 ; j++){
                for (k =0 ; k < 4 ; k++){
                    d[i][j][k] = i*j*k;
                }
            }
        }
        for (i = 0; i < 2; i++){
            for (j = 0 ; j < 3 ; j++){
                for (k =0 ; k < 4 ; k++){
                    System.out.print(d[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}
