package a3_loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // AP 2,5,8,11.....
//     for(int i=2;i<3*n;i+=3){
//         System.out.println(i);
//        }

        //gp 1,2,4,8...
//        int a=1;
//        for(int i=1;i<=n;i++){
//            System.out.println( a);
//            a*=2;
//        }

        // series 99,95,91...
        for(int i=n;i>=1;i-=4){
            System.out.println(i);
        }

    }
}
