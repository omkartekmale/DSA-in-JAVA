package binary_ser;

public class minizeMaxProduct {
    public static boolean possible(int mid,int n,int[]arr){
        int store=0;
        for(int i=0;i<3;i++){
            if(arr[i]%mid==0) store+=arr[i]/mid;
            else store+=arr[i]/mid +1;
        }
        if(store>n) return false;
        return true;
    }
    public static void main(String[] args) {
        int [] product={10,15,10};
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            mx=Math.max(mx,product[i]);
        }
        int lo=1;
        int hi=mx;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(possible(mid,7,product)){
                ans=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }gi
        System.out.println(ans);
    }
}
