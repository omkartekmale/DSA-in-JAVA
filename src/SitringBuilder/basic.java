package SitringBuilder;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());

        for(int i=0;i<sb.length();i++){
            int x=(int)sb.charAt(i);
            if(x>=65 && x<=90){
                x+=32;
                sb.setCharAt(i,(char)x);
            }
            else {
                x-=32;
                sb.setCharAt(i,(char) x);
            }
        }
        System.out.println(sb);
    }
}
