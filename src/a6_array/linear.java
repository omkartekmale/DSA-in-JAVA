package a6_array;

import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter search no. ");
        int x=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.print("Elent is found at index :"+i);
                break;
            }
        }
    }
}
