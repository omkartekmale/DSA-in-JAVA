package a9_2_2D_Array;

public class flip_a_matrix {
    public static void main(String[] args) {
        int []arr={1,0,1,0};
        int ans=0;
        int multi=1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==1){
                ans+=multi;
            }
            multi*=2;

        }
        System.out.println(ans);
    }
}
