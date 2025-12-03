package a9_2_2D_Array;

public class matrix_multy {
    public static void main(String[] args) {
        int [][]arr1={{1,2,3},{1,2,3},{1,2,3}};
        int[] []arr2={{1,2,3},{1,2,3},{1,2,3}};
        int res=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<3;j++){
                 res=0;
                for(int k=0;k<3;k++){
                   res+=(arr1[i][k]*arr2[k][j]);
                }
                System.out.print(res+" ");
            }
            System.out.println();
        }
    }
}
