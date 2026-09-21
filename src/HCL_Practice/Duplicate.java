package HCL_Practice;

import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        int arr[]={2,3,2,1,5,6};

        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
                break;
            }
            else{
                set.add(arr[i]);
            }
        }
    }
}
