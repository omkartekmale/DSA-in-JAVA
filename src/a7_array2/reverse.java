package a7_array2;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.swap;

public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int [] arr={2,4,5,2,1};

//        int [] arr2=new int[arr.length];
//
//        int j=0;
//        for(int i=arr.length-1;i>=0;i--){
//            arr2[j++]=arr[i];
//
//        }
//        for(int i=0;i<arr2.length;i++){
//            System.out.print(arr2[i]+" ");
//        }
        int i=0;
        int j= arr.length-1;
        while(i<j){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
            i++;
            j--;

        }

    }
}
