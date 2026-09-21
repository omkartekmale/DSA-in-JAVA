package dp;

public class subsetSum {
    public static boolean subset(int[]arr,int C,int i){
        if( i==arr.length){
            if(C==0) return true;
            return false;
        }
        boolean skip= subset(arr,C,i+1);
        if(arr[i]>C) return skip; //only for positive no.
        boolean take=subset(arr,C-arr[i],i+1);
        return skip || take;
    }
    public static void main(String[] args) {
        int [] arr={0,8,2,5,4};
        int C=9;
        System.out.println(subset(arr,C,0));

    }
}
