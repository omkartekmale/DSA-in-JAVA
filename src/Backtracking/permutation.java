package Backtracking;
import java.util.*;
class Solution {

    public static void helper(  int[]nums,List<List<Integer>>ans,List<Integer>arr,int n,boolean[]check){
        if(arr.size()==n){
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0;i<n;i++){
            if(!check[i]){
                arr.add(nums[i]);
                check[i]=true;
                helper(nums,ans,arr,n,check);
                arr.remove(arr.size()-1);
                check[i]=false;
            }
        }

    }
    public static List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>arr=new ArrayList<>();
        boolean []check=new boolean[n];
        helper(nums,ans,arr,n,check);
        return ans;
    }

    public static void main(String[] args) {
        int []nums={1,2,3};
        List<List<Integer>>ans=permute(nums);
        System.out.println(ans);

    }
}
