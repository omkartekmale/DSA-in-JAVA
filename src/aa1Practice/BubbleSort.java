package aa1Practice;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={2,3,1,4,1};
          int n=arr.length;
//        for(int j=1;j<arr.length;j++){
//            boolean flag=true;
//            for(int i=0;i<arr.length-i;i++){
//                if(arr[i]>arr[i+1]){
//                    int temp=arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1]=temp;
//                    flag=false;
//                }
//            }
//            if(flag) break;
//        }

//        for(int i=0;i<n-1;i++){
//            int mididx=i;
//            for(int j=i+1;j<n;j++){
//                if(arr[mididx]>arr[j]){
//                    mididx=j;
//                }
//            }
//            int temp=arr[i];
//            arr[i]=arr[mididx];
//            arr[mididx]=temp;
//        }

//        for(int i=1;i<n;i++){
//            int j=i;
//            while(j>0 && arr[j]<arr[j-1]){
//                int temp=arr[j];
//            arr[j]=arr[j-1];
//            arr[j-1]=temp;
//            j--;
//            }
//        }

//        int tar=3;
//        int lo=0;
//        int hi=n-1;
//        while(lo<=hi){
//            int mid=(lo+hi)/2;
//            if(arr[mid]==tar){
//                System.out.println(mid);
//                break;
//            }
//            else if(arr[mid]>tar) hi=mid-1;
//            else lo=mid+1;
//        }

        for(int e:arr)
            System.out.print(e+" ");

    }
}
