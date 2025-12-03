package String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str2="bcd";
        String str=sc.nextLine();
        System.out.println(str.charAt(1));
        System.out.println(str.length());
        System.out.println(str.indexOf('o'));
        System.out.println(str.compareTo(str2));


    }
}
