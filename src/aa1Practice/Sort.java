package aa1Practice;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        for(int x:arr) System.out.print(x+" ");

        // Dautch Algo
        int  mid=0;
        int lo=0;
        int hi=n-1;

        while (mid<=hi){
            if(arr[mid]==0){
                swap(arr,lo,mid);
                mid++;
                lo++;
            }
            else if(arr[mid]==1) mid++;
            else{
                swap(arr,mid,hi);
                hi--;
            }

        }
        System.out.println();
        for(int x:arr) System.out.print(x+" ");


    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
