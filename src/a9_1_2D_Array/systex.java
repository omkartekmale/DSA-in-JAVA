package a9_1_2D_Array;

import java.util.Scanner;

public class systex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr =new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
               max=Math.max(max,arr[i][j]);
            }

        }
        System.out.println("max"+max);

    }
}
