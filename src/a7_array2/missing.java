package a7_array2;

public class missing {
    public static void main(String[] args) {
        int []arr={1,3,5,2};
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int summ=0;
        for(int i=0;i<n-1;i++){
            summ+=arr[i];
        }
        int miss=sum-summ;
        System.out.println(miss);

       // int []miss=new int[n];
//        for(int i=0;i<n;i++){
//            if(arr[i]!=i+1) {
//                System.out.println(i+1);
//                break;
//            }
       // }
    }
}
