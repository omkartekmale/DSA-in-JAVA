package Stack2;

import java.util.Stack;

public class stackSpan {
    public static void main(String[] args) {
        int []arr={100,80,60,70,60,75,85};
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        st.push(0);
        int[]s=new int[n];
        s[0]=1;

        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]) st.pop();
            s[i]=st.isEmpty()?i+1:i-st.peek();
            st.push(i);
        }
        for(int ele:s){
            System.out.print(ele+" ");
        }
    }
}
