package HCL_Practice;

public class Armstrong {
    public static void main(String[] args) {
        int n=371;
        int original=n;
        int digit=String.valueOf(n).length();
        int sum=0;

        while(n!=0){
            int rem=n%10;
            sum+=(int)Math.pow(rem,digit);
            n/=10;
        }
        if(sum==original) System.out.println(true);
        else System.out.println(false);
    }
}
