package LInked_list;
class node{
    int val;
    node next;
    node(int val){
        this.val=val;
    }
}
public class basic {
    public static void main(String[] args) {
        node a=new node(10);
        node b=new node(10);
        node c=new node(10);
        node d=new node(10);
        node e=new node(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.next);
        System.out.println(a.val);
        System.out.println(b.next);
    }
}
