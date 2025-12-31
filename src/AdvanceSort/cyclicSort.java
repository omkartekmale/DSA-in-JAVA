package AdvanceSort;

public class cyclicSort {
    public static void main(String[] args) {
        int[]arr={5,4,3,1,0,2};
        int n=arr.length;
        int i=0;
        while(i<n){
            if(i==arr[i]) i++;
            else{
                int temp=arr[i];
                arr[i]=arr[temp];
                arr[temp]=temp;
            }
        }
        for(int ele:arr) System.out.print(ele+" ");
    }
}
