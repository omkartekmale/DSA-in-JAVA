package Stack1;

import java.util.Stack;

public class copystatck {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
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
        Stack<Integer>copy=new Stack<>();
        while(!temp.isEmpty()){
            copy.push(temp.pop());
        }
        System.out.println(copy);

    }
}
