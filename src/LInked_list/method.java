package LInked_list;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class link_list{
    Node tail;
    Node head;

    void addathead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
    }

    void addattail(int val){
        Node temp=new Node(val);
        if(tail==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
    }

    void deleteathead(){
        if(head==null){
            System.out.println("enpty");
            return;
        }
        head=head.next;
        if(head==null) tail=null;
    }
    void display(){
        if(head==null) return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;

        }
        System.out.println();
    }



}
public class method {

    public static void main(String[] args) {

        link_list ll =new link_list();
        ll.addattail(10);
        ll.addattail(20);
        //ll.display();
        ll.addathead(5);
        ll.display();


    }
}
