package HCL_Practice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

       StringBuilder sb=new StringBuilder(s);
        int i=0;
        int j=s.length()-1;

        while(i<=j){
            char ch=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,ch);
            i++;
            j--;
        }
        String s2=sb.toString();
        System.out.println(s.equals(s2));
    }
}
