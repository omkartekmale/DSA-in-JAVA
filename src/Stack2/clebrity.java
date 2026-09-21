package Stack2;

import java.util.Stack;

public class clebrity {
    public static void main(String[] args) {
        int mat[][] = {{1, 1, 0},
                {0, 1, 0},
        {0, 1, 1}};
        int n=mat.length;
        Stack<Integer>st=new Stack<>();
        for(int i=0; i<n;i++) st.push(1);
        while(st.size()>1){
            int a=st.pop();
            int b=st.pop();
            if(mat[a][b]==0) st.push(a);
            if(mat[b][a]==0)st.push(b);
        }
        if(!st.isEmpty()) {
            for (int i = 0; i < n-1; i++) {
                if(i==st.peek()) continue;
                if (mat[i][st.peek()]==mat[st.peek()][i]) {
                    st.pop();
                    break;
                }
            }
        }
        if (st.isEmpty()) System.out.println("no cele");
        else System.out.println(st.peek() + 1);

    }
}
