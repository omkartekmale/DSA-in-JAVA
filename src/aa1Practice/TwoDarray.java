package aa1Practice;

public class TwoDarray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,55,6},{7,8,9}};
        int[][] arr2={{1,2,3},{4,55,6},{7,8,9}};

        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(i%2==0) {
                for (int j = 0; j < arr[0].length; j++) {
                    //max=Math.max(arr[i][j],max);
                    //  System.out.print(arr[i][j]+arr2[i][j]+"  ");

                    System.out.print(arr[i][j]+"  ");
                }
            }
            else{
                for(int k=arr.length-1;k>=0;k--){
                    System.out.print(arr[i][k]+"  ");
                }
            }
           // System.out.println();
        }
       // System.out.println(max);
    }
}
