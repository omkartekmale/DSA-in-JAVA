package Heap;
class Heap{
    private int arr [];
    private int size;
    Heap(int capacity){
        arr=new int[capacity];
        size=0;
    }
    public void add(int ele) throws Exception{
        if(size==arr.length) throw new Exception("Heap is full ");
        arr[size++]=ele;
        upheapify(size-1);
    }
    public void upheapify(int idx){
        if(idx==0) return;
        int parent=(idx-1)/2;
        if(arr[idx]<arr[parent]){
            int temp=arr[parent];
            arr[parent]=arr[idx];
            arr[idx]=temp;
            upheapify(parent);
        }
    }
    public int size(){
        return size;
    }
    public int peek() throws Exception{
        if(size==0) throw new Exception("Heap is Empty");
        return arr[0];
    }
}
public class implement {
    public static void main(String[] args) throws Exception{
        Heap pq=new Heap(10);
        pq.add(20);
        pq.add(30);
        System.out.println(pq.size());
        pq.add(-1);
        System.out.println(pq.peek());
    }
}
