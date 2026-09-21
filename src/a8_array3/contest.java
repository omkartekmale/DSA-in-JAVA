package a8_array3;

public class contest {
    public static boolean ispresent(int [] nums,int x){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x) return true;
        }
        return false;
    }
    public static  int subarray(int [] nums,int j,int k){
        int sum=0;
        for(int i=j;i<=k;i++){
            sum+=nums[i];
        }
        return sum;
    }

    public static int centeredSubarrays(int[] nums) {
        int j=0;
        int n=nums.length;
        int count=0;
        while(j<n){
            for(int i=j;i<n;i++){
                int sum=subarray(nums,j,i);
                if(ispresent(nums,sum)) count++;
            }
            j++;
        }
        return count;

    }
    public static void main(String[] args) {
        int []nums={2,-3};
        System.out.println(centeredSubarrays(nums));

}
}