package a3_loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int s=0;
        while(num!=0){
            s*=10;
            s+=num%10;
            num/=10;

        }
        System.out.println(s);
    }
}
