package a4_pattern;

import java.util.Scanner;

public class triangle_II {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();


//        for(int i=1;i<=n;i++){
//            int a=1;
//            for(int j=1;j<=i;j++){
//                    System.out.print(a +" ");
//                    a+=2;
//
//            }
//            System.out.println();
//        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               if(i==j || i%2==0) System.out.print(1);
                else System.out.println(0);
            }
            System.out.println();
        }
    }
}
