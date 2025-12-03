package a9_1_2D_Array;

import java.sql.SQLOutput;

public class sumof2matrix {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int [][] arr2={{1,2,3},{4,5,6},{7,8,9}};


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+arr2[i][j]+" ");

            }
            System.out.println();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]*arr2[j][i]+" ");

            }
            System.out.println();
        }
    }
}
