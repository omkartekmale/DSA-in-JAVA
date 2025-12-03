package a3_loops;

import java.util.Scanner;

public class whilee {
    // used when no idea about iteration
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cout=0;
//        while(i<=10){
//            System.out.println(i);
//            i+=2;
//        }

//        while(n!=0){
//            n/=10;
//            cout++;
//        }
//        System.out.println(cout);
//
        int a=0;
        while(n!=0){
            a+=n%10;
            n/=10;
        }
        System.out.println(a);
    }
}
