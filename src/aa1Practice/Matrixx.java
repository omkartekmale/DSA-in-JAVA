package aa1Practice;

public class Matrixx {
    public static void main(String[] args) {
        int [][] arr1={{1,2,3},{1,2,3},{1,2,3}};
        int [][] arr2={{1,2,3},{1,2,3},{1,2,3}};

        int [][] result=new int[arr1.length][arr2[0].length];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                for(int k=0;k<arr1[0].length;k++){
                    result[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }

        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
