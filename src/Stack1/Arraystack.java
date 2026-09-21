package Stack1;

public class Arraystack {
    public static class Stack{
         private int [] arr=new int[5];
        private int idx=0;
        int peak(){
            if(idx==0) return -1;
            return arr[idx-1];
        }
        void push(int x){
            if(idx==arr.length) {
                 System.out.println( "stack is full");
                 return;
            }
            arr[idx]=x;
            idx++;
        }
        void display(){
            if(idx==0){
                System.out.println("stack is Empty");
                return;
            }
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            return false;
        }
        int pop(){
            if(isEmpty()) return -1;
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }

    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);


        st.display();
        System.out.println( st.peak());
        System.out.println(st.size());
         st.pop();
        st.display();



    }

}
