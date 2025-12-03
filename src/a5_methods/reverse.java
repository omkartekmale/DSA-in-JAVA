package a5_methods;

public class reverse {
    public static void main(String[] args) {
        int n=-129;
        int rev=0;
        while(n!=0){
            rev*=10;
            rev+=n%10;
            n/=10;
        }
        System.out.println(rev);

    }
}
