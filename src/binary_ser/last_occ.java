package binary_ser;

public class last_occ {
    public static void main(String[] args) {
        int x=3;
        int [] arr={5,4,4,3,2,2,2,1,1};
        int lo=0;
        int hi=arr.length-1;
        int idx=-1;
        while(lo<=hi){
            int min=(lo+hi)/2;
            if(arr[min]==x){
                idx=min;
                lo=min+1;
            }
            else if(arr[min]>x) hi=min-1;
            else lo=min+1;
        }
        System.out.println(idx);

    }
}
