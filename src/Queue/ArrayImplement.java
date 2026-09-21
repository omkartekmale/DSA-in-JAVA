package Queue;
class MyQueue{
    int[]arr=new int[10];
    int f=0;
    int r=0;

    void add(int val){
        arr[r++]=val;
    }
    void display(){
        for(int i=f;i<r;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int remove(){
        int top=arr[f];
        f++;
        return top;
    }
}

public class ArrayImplement {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.display();
        q.remove();
        q.display();

    }
}
