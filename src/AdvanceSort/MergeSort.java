package AdvanceSort;

public class MergeSort {
    static void sortarr(int[]a,int[]b,int []arr){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) arr[k++]=a[i++];
            else arr[k++]=b[j++];
        }
        while(i<a.length) arr[k++]=a[i++];

        while(j<b.length) arr[k++]=b[j++];

    }
    public static void mergesort(int[]arr){
        if(arr.length==1) return;
        int n1=arr.length/2;
        int n2=arr.length-n1;
        int [] a=new int[n1];
        int []b=new int[n2];
        for(int i=0;i<n1;i++){
            a[i]=arr[i];
        }
        for(int i=0;i<n2;i++){
            b[i]=arr[n1+i];
        }
        mergesort(a);
        mergesort(b);
        sortarr(a,b,arr);
    }
    public static void main(String[] args) {
        int []arr={2,3,4,1,5,8};
        mergesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
