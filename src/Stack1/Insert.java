package Stack1;

import java.util.Stack;

public class Insert {

    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        int ele=10;
        int pos=2;
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);
        Stack<Integer>temp=new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        temp.push(ele);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.println(st);

    }
}
