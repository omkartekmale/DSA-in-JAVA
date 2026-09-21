package Linked_List1;

class SLL{
    Node head;
    Node tail; // default null
    int size; //default 0
    void inserstATtail(int val){
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void inserstAThead(int val){
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void insert(int idx,int val){
        Node temp=new Node(val);
        if(idx==0){
            inserstAThead(val);
            return;
        }
        if(idx==size){
            inserstATtail(val);
            return;
        }
        if(idx>size|| idx<0){
            System.out.println("invalid indexx ! ");
            return;
        }
        Node x=head;
        for(int i=1;i<idx;i++){
            x=x.next;
        }
        temp.next=x.next;
        x.next=temp;
        size++;
    }
    int get(int idx) throws Error{
        if(idx<0 || idx>=size){
            throw new Error("Invalid Indexx");
        }
        Node temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp.val;

    }
    void set(int idx,int val){
        if(idx>=size|| idx<0){
            System.out.println("invalid indexx ! ");
            return;
        }
        Node temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        temp.val= val;

    }
    void deleteHead(){
        head=head.next;
        size--;
    }
    void delete(int idx){
      if(idx==0){
          deleteHead();
          return;
      }
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        if(temp.next==tail) tail=temp;
        temp.next=temp.next.next;
    size--;
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class implementSLL {
    public static void main(String[] args) {
        SLL ll=new SLL();
        ll.inserstATtail(10);
        ll.inserstATtail(10);
        ll.inserstATtail(10);
        ll.inserstATtail(10);
        ll.print();
        System.out.println(ll.size);
        ll.inserstAThead(5);
        ll.print();

        ll.insert(2,30);
        ll.print();

        ll.insert(5,33);
        ll.print();


        System.out.println(ll.get(0));
        ll.set(-1,18);
        ll.print();

        ll.delete(0);
        ll.print();
        System.out.println(ll.head.val);
        System.out.println(ll.size);



    }
}
