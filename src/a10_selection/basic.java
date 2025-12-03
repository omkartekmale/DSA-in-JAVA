package a10_selection;

public class basic {
    public static void main(String[] args) {
        int [] arr={ 2,3,5,6,7,8,2};
        for(int i=0;i<arr.length-1;i++) {
            int minidex=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[minidex]) {
                    minidex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidex];
            arr[minidex] = temp;
        }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
        }
    }
}
