package recusion;

public class pip {

    public static void pip(int n){
        if(n==0) return;
        System.out.println(n);
        pip(n-1);
        System.out.println(n);
        pip(n-1);
    }
    public static void main(String[] args) {
        pip(2);
    }
}
