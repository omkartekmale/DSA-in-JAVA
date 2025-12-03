package a3_loops;

import java.util.Scanner;

public class II_asci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        for(int i=65;i<=n;i++){
//            System.out.println((char)i);
//        }
        int a=n;
        for(int i=1;i<=n;i++){
            System.out.println(i);
            System.out.println(a);
            a-=1;
        }
        char z='Z';
        System.out.println((int)z);
    }
}
