package Stack2;

import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int[]arr={1,3,4,5,4,35,5};
        int n=arr.length;

        int [] output=new int[n];

        Stack<Integer> stack = new Stack<>();

        output[n-1]=-1;

        stack.push(arr[n-1]);

        for(int i=n-2;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<arr[i]) stack.pop();
            output[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(arr[i]);
        }

        for(int ele:output){
            System.out.print(ele+" ");
        }
    }
}
