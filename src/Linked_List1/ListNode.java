package Linked_List1;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class ListNode {
    public static void main(String[] args) {
        Node a=new Node(10); // creating node;
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);

        a.next=b; //linking
        b.next=c;
        c.next=d;

        Node temp=a;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
           temp= temp.next;
        }
    }
}
