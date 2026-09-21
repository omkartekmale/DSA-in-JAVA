package Linked_List1;

public class displayLLrec {

    public static void print(Node a){
        Node temp=a;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static void recprint(Node a){
        if(a==null) return;
        System.out.print(a.val+" ");
        recprint(a.next);
    }

    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);

        a.next=b;
        b.next=c;

        print(a);
        System.out.println();
        recprint(a);
    }
}
