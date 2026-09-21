package Queue;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
 class Queue{
    Node head;
    Node tail;
    int size=0;
     void push(int val){
         Node temp=new Node(val);
         if(head==null) head=tail=temp;
         else{
             tail.next=temp;
             tail=temp;
         }
         size++;
     }
     void display(){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.val+" ");
             temp=temp.next;
         }
         System.out.println();
     }
     int remove(){
         int top=head.val;
         head=head.next;
         size--;
         return top;
     }
        }

public class LLimplem {
    public static void main(String[] args) {
        Queue q=new Queue();//object
        q.push(10);
        q.push(20);
        q.push(30);

        q.display();
        System.out.println(q.remove());


    }
}
