package a6_array;


import java.util.Arrays;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//        int sum=0;
//        for (int j=0;j<arr.length;j++){
//            sum+=arr[j];
//        }
//        System.out.print(sum + " ");

//        int a=arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>a) a=arr[i];
//        }
//        System.out.println(a);

        int []show=arr;//shollow array
        show[2]=0;

        Arrays.sort(show);

        int [] copy= Arrays.copyOf(arr,arr.length);//copying for original arr;
        for(int i=0;i<copy.length;i++){
            System.out.print(copy[i]+" ");
        }
    }
}
