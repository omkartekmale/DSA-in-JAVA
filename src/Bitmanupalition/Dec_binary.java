package Bitmanupalition;

public class Dec_binary {
    public static void main(String[] args) {
        int n=8;
        StringBuilder st =new StringBuilder();
        while(n!=0){
            int x=n%2;
            st.append(x);
            n/=2;
        }
        System.out.println(st.reverse());
    }
}
