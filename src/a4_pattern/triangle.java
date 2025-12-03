package a4_pattern;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if(i%2!=0) System.out.print(j+" ");
//                else {
//                    int a=j+64;
//                    System.out.print((char)a+" ");
//                }
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i==1 || j==1|| j==n) System.out.print("* ");
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        int mid=(n/2)+1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//
//                if(i==mid || j==mid) System.out.print("* ");
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i+j==n+1) System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
