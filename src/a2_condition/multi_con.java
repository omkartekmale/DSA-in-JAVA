package a2_condition;

import java.util.Scanner;

public class multi_con {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>999 && num<10000){
            System.out.println("yes");
        }
        else{
            System.out.println("not");
        }

    }
}
