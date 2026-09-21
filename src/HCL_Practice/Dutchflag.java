package HCL_Practice;

public class Dutchflag {
    public static void main(String[] args) {
        int[] arr={2,1,0,0,2,1};

        int i=0;
        int mid=0;
        int j=arr.length-1;

        while(mid<j){
            if(arr[mid]==0){
                int temp=arr[i];
                arr[i]=arr[mid];
                arr[mid]=temp;
                i++;
                mid++;
            }
            else if(arr[mid]==1) mid++;
            else{
                int temp=arr[mid];
                arr[mid]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        for(int ii:arr)
            System.out.println(ii);
    }
}
