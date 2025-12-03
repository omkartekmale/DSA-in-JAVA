package a8_array3;

public class addingone {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int sum=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            
            sum+=arr[i];
            System.out.println(sum+" ");
        }
        System.out.println(sum+1);
    }
}
