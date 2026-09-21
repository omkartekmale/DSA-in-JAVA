package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class mincost {
    public static void main(String[] args) {
        int [] arr={2,4,3,6};
        PriorityQueue<Integer>pq=new PriorityQueue<>(); // min heap
        for(int ele:arr) pq.add(ele);
        int cost=0;
        while(pq.size()>1){
            int x=pq.remove();
             x+=pq.remove();
            cost+=x;
            pq.add(x);
        }
        System.out.println(cost);
    }
}
