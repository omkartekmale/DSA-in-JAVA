package BinnaryTree;


class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class Implementation {
    static void display(Node head){
        if(head==null) return ;
        System.out.print(head.val+" ");
        display(head.left);
        display(head.right);
    }
    static int sum(Node head){
        if(head==null) return 0;
        //if(head.val==0) head.val=1;
        return head.val+sum(head.right)+sum(head.left);
    }
     static int product(Node head){
        if(head==null) return 1;
        if(head.val==0) head.val=1;
        return head.val*product(head.right)*product(head.left);
    }
    static int max(Node head){
        if(head==null) return Integer.MIN_VALUE;
       // sum=Math.max(sum,head.val);
        int a=head.val,b=max(head.right),c=max(head.left);
        return Math.max(a,(Math.max(b, c)));
    }
    static int size(Node head){
        if(head==null) return 0;
        return 1+size(head.left)+size(head.right);
    }
     static int level(Node head){
        if(head==null) return 0;
        int a= level(head.left),b=level(head.right);
        return 1+Math.max(a,b);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(0);
        Node d=new Node(111);
        Node e=new Node(11);
        a.left=b;
        a.right =c;
        b.left=d;
        c.right=e;
        display(a);
        System.out.println();
        System.out.println( sum(a));
        System.out.println(max(a));
        System.out.println(size(a));
        System.out.println(level(a));
        System.out.println(product(a));



    }
}
