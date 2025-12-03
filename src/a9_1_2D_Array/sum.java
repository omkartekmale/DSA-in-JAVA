package a9_1_2D_Array;

public class sum {
    public static void main(String[] args) {
        int [][] arr={{3,4,2},{3,4,5}};
        int n=arr.length;
        int m=arr[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
