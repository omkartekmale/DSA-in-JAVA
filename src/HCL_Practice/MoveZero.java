package HCL_Practice;

public class MoveZero {
    public static void main(String[] args) {
        int arr[]={1,0,1,0,0,1};

        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==1)i++;
            else if(arr[j]==0) j--;
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        for(int ii:arr)
            System.out.println(ii);
    }
}
