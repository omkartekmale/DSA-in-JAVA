package a4_pattern;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(i%2==0) {
                    int a=i+97;
                    System.out.print((char)a +" ");
                }
                else{
                    int b=i+65;
                    System.out.print((char)b +" ");
                }
            }
            System.out.println( );
        }
    }
}
