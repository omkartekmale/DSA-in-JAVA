package a3_loops;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            if(i%2!=0 && i%3==0) System.out.println(i);
//        }

//        for(int i=17;i<=170;i+=17){
//            System.out.println(i);
//        }

        for(int i=n;i>=1;i--){
            System.out.println(i);
        }

    }
}
