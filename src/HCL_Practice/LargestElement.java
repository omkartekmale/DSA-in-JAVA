package HCL_Practice;

public class LargestElement {
    public static void main(String[] args) {
        int []arr={3,4,1,5,99,23};

        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(max+"  "+smax);
    }
}
