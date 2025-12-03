package LInked_list;
//class Node{
//    int val;
//    Node next;
//    Node(int val){
//        this.val=val;
//    }
//}
public class display_list {
    public static int display_idx(Node head, int idx) {
        for (int i = 1; i < idx; i++) {
            head = head.next;
        }
        return head.val;
    }

    public static void display(Node head){
//        Node temp=head;
//        while(temp!=null){
//            System.out.print(temp.val+"->");
//            temp=temp.next;
//        }
//        System.out.println("null");
        for(Node temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.val+" ");
        }
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);

        a.next=b;
        b.next=c;
        c.next=d;
 //display(a);
        System.out.println(display_idx(a,3));
    }
}
