package Stack1;

import java.util.Stack;

public class reverse {
    public static void reversee(Stack<Integer>st){
        if(st.size()==0) return;
        int top=st.pop(); // 8 6 4  2
        reversee(st);
        st.push(top);
        System.out.println(top);
    }
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        System.out.println(st);
        Stack<Integer>temp=new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        System.out.println(temp);
        reversee(temp);
        //System.out.println(temp);

    }
}
