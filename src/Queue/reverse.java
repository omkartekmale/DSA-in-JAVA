package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class reverse {
    public static void reverse( Queue<Integer> q){
        int n=q.size();
        if(n<=0) return;
        int top= q.remove();
        reverse(q);
        System.out.print(top+" ");
    }
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        reverse(q);
    }
}
