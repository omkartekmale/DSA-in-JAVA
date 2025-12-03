package a7_array2;

public class rotate {
    public static void reverse(int i,int j,int[]arr){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int [] arr={2,3,1,4,3,4};
        int n=arr.length;
        int d=2;
//        int []arr2=new int[n];
//        int j=0;
//        for(int i=d;i<n;i++){
//            arr2[j++]=arr[i];
//        }
//        for(int i=0;i<d;i++){
//            arr2[j++]=arr[i];
//        }

        reverse(0, d , arr);
        reverse(d+1, n-1, arr);
        reverse(0,n-1,arr);

        for(int ele:arr){
            System.out.print(ele+" ");
        }




    }
}
