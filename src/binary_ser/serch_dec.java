package binary_ser;

public class serch_dec {
    public static void main(String[] args){

    int[] arr = {9, 7, 6, 5, 4, 3, 2};
    int lo = 0;
    int hi = arr.length - 1;
    int target = 3;
    while(lo<=hi) {
        int mid = (lo + hi) / 2;
        if (arr[mid] == target) {
            System.out.println(mid);
            break;
        }
        else if (arr[mid] > target) lo = mid + 1;
        else hi = mid - 1;

    }
}
}
