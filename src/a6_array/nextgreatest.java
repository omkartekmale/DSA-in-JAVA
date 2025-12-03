package a6_array;

import java.util.Scanner;

class nextgreatest {

    public static void main(String[] args) {
        // write your code logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int nge=arr[n-1];
        for(int i=n-2;i>=0;i--){
            nge=Math.max(nge,arr[i]);
            arr[i]=nge;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}