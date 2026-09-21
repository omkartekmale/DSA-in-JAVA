package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class implemntation {
    public static void display( Queue<Integer> q){
        int n=q.size();
        for(int i=0;i<n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static void add( Queue<Integer> q,int ele,int pos){
        int n=q.size();
        if(pos>=n){
            q.add(ele);
            return;
        }
        for(int i=0;i<n;i++){
            if(i==pos) q.add(ele);
            q.add(q.remove());
        }
    }
    public static int remove( Queue<Integer> q,int pos){
        int n=q.size();
        for(int i=0;i<pos;i++){
            q.add(q.remove());
        }
        int top=q.remove();
        for(int i=0;i<n-1;i++){
            q.add(q.remove());
        }
        return top;
    }

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        display(q);
        add(q,40,3);
        display(q);
        remove(q,3);
        display(q);

    }
}
