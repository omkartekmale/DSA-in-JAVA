package HCL_Practice;

public class MaxSumSubarray {
    public static void main(String[] args) {

        //Kadane's Algorithm


        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int csum=arr[0];
        int msum=arr[0];

        for(int i=1;i<arr.length;i++){
            csum=Math.max(arr[i],arr[i]+csum);
            msum=Math.max(csum,msum);
        }

        System.out.println(msum);
    }
}
