package a8_array3;

import java.util.ArrayList;
import java.util.Collection;

public class arraylist1 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        //int n=arr.size();

        arr.add(20);
        arr.add(21);
        arr.add(7);

        arr.set(1,50);

        // Collection.reverse(arr);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

    }
}
