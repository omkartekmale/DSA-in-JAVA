package a9_1_2D_Array;

public class rotate_mat {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int [][]res=new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) {
                 res[i][j]= arr[j][i];
            }
        }
        int idx=0;
        int j1=arr.length-1;
        while(idx<=j1){
            int temp=res[idx][0];
            res[idx][0]=res[idx][j1];
            res[idx][j1]=temp;
            idx++;
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(res[i][j]+" ");

            }
            System.out.println();
        }
    }
}
