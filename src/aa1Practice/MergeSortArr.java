package aa1Practice;

import java.util.Scanner;

public class MergeSortArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,3,4,5,6};
        int arr2[]={2,3,5,6,7,9};
        int []ans=new int[11];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr.length && j<arr2.length){
            if(arr[i]<arr2[j]){
                ans[k]=arr[i];
                i++;
            }
            else{
                ans[k]=arr2[j];
                j++;
            }
              k++;
        }
        while(i<arr.length){
            ans[k]=arr[i];
            i++;
            k++;

        }
        while(j<arr2.length){
            ans[k]=arr2[j];
            j++;
            k++;
        }
        for(int x:ans) System.out.print(x+" ");
    }
}