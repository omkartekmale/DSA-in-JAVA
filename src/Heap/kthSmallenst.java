package Heap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallenst {
    public static void main(String[] args) {
        int [] arr={2,3,1,-4,2,4,4};
        int k=1;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        System.out.println(pq.peek());
    }
}
