package a9_1_2D_Array;

import java.util.Scanner;

public class roll_marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] result=new int[4][2];
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                result[i][j]=sc.nextInt();
            }
        }
        for(int []ele:result){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
