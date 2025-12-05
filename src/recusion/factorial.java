package recusion;

public class factorial {
    public static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
      //  int fact=1;
        int n=5;
        System.out.println(fact(n));
    }
}
