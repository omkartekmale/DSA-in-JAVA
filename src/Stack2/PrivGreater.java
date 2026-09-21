package Stack2;

import java.util.Stack;

public class PrivGreater {
    public static void main(String[] args) {
        int[] arr = {10, 2, 4, 30, 40, 1, 13, 44};
        int n=arr.length;
        int[] output=new int[n];
        Stack<Integer>st=new Stack<>();
        output[0]=-1;
        st.push(arr[0]);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && st.peek()<arr[i]) st.pop();
            output[i]=st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
        }

        for(int ele:output){
            System.out.print(ele+" ");
        }

    }
    }
