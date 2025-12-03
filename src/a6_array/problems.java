package a6_array;

import java.util.Arrays;
import java.util.Scanner;

public class problems {
    public static void print(int []arr){

        for(int i=0;i<arr.length;i++){
            if(i%2==0) arr[i]+=10;
            else arr[i]*=2;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [] arr =new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       // print(arr);
        // Arrays.sort(arr);

        // print(arr);

    }
}
