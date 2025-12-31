package AdvanceSort;

public class quicksort {
    public static int pirtion(int []arr,int st,int ed){
        int mid=(st+ed)/2;
        int i=st-1;
        int pivot=arr[mid];
        int temp=arr[mid];
        arr[mid]=arr[ed];
        arr[ed]=temp;

        for(int j=st;j<ed;j++){
            if(arr[j]<=pivot){
                i++;
                 temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
         temp=arr[i+1];
        arr[i+1]=arr[ed];
        arr[ed]=temp;
        return i+1;

    }
    public static void quick(int[]arr,int st,int ed){
        if(st>ed) return;
        int pi=pirtion(arr,st,ed);
        quick(arr,st,pi-1);
        quick(arr,pi+1,ed);
    }
    public static void main(String[] args) {
        int []arr={2,3,4,2,5,1,6};
        quick(arr,0,arr.length-1);
        for(int ele:arr) System.out.print(ele+" ");
    }
}
