package recusion;

public class commons {
    public static long countCommas(long n) {
        if(n<=999) return 0;
        return 1+countCommas(n-1);
    }
    public static void main(String[] args) {
        long n=10000;
        System.out.println(countCommas(n));
    }
}
