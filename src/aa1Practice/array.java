package aa1Practice;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    static void print(int arr[]){
        for(int j:arr)
        System.out.print(j+" ");
        System.out.println();
    }
    static void change(int [] arr){
        arr[3]=100;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        print(arr);
        int [] x=arr;
        int[] deep= Arrays.copyOf(arr,3);
        change(arr);
        print(arr);
        print(x);
        print(deep);
        Arrays.sort(arr);
        print(arr);

    }
}
