package a9_bubble_sort;

public class bubble {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr={0,3,0,5,5,0};

        print(arr);
       int count=0;
        boolean flag=false;
        for(int i=0;i<arr.length-2;i++){
                for(int j=0;j<arr.length-1;j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag=true;

                }
                count++;
            }
                if(flag==false) break;
            }

        print(arr);
        System.out.println(count);
    }
}
