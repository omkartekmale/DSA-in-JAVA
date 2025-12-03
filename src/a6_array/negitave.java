package a6_array;

import java.util.Scanner;

public class negitave {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
