package AdvanceSort;

public class inversioncount {
    static int count=0;
    public static int invcount(int[]a,int[]b){
        int i=0;
        int j=0;
        int c=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]) {
                c += a.length - i;
                j++;
            }
            else i++;
        }
        return c;
    }
    static void sortarr(int[]a,int[]b,int []arr){
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]) arr[k++]=a[i++];
            else{
                arr[k++]=b[j++];

            }
        }
        while(i<a.length) {

            arr[k++]=a[i++];
        }

        while(j<b.length) {

            arr[k++]=b[j++];
        }


    }
    public static void mergesort(int[]arr){
        if(arr.length==1) return;
        int n1=arr.length/2;
        int n2=arr.length-n1;
        int [] a=new int[n1];
        int []b=new int[n2];
        for(int i=0;i<n1;i++){
            a[i]=arr[i];
        }
        for(int i=0;i<n2;i++){
            b[i]=arr[n1+i];
        }
        mergesort(a);
        mergesort(b);
        count+=invcount(a,b);
        sortarr(a,b,arr);

    }
    public static void main(String[] args) {
        int []arr={8,2,5,3,1,4};
        mergesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print(count);
    }
}
