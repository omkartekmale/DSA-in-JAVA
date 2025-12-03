package a7_array2;

public class Zero_and_one {
    public static void main(String[] args) {
        int []arr={1,1,0,1,0,0,1};

        int n=arr.length;

//        int noo=0;
//        int noz=0;

//        for(int i=0;i<n;i++){
//            if(arr[i]==0) noz++;
//            else noo++;
//        }
//        for(int i=1;i<=n;i++){
//            if(i<=noz) System.out.print(0+" ");
//            else System.out.print(1+" ");
//        }

        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }


    }
}
