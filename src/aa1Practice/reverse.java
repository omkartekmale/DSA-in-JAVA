package aa1Practice;

import java.util.Scanner;

public class reverse {
    static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }

    static int miss(int[] arr){
        int n=arr.length;
        int to=(n*(n+1))/2;
        int sum=0;
        for(int x:arr) sum+=x;
        return to-sum;
    }
    static int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max) max=x;
        }
        return max;
    }
    static void print(int [] arr){
        for(int x:arr) System.out.print(x+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [] arr=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

     //   reverse(arr);

        print(arr);

//        reverse(arr,0,1);
//        reverse(arr,2,arr.length-1);
//        reverse(arr,0,arr.length-1);

     //   print(arr);
       // System.out.println(miss(arr));

      //  System.out.println(max(arr));

    int count=0;
    int x=4;
    for(int i=0;i<n;i++){
        if(arr[i]>x) count++;
    }
        System.out.println(count);
    }
}
