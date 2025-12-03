package a2_condition;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        int l=sc.nextInt();
//        int b=sc.nextInt();

//        int area=l*b;
//        int peri=2*(l+b);

//        if(area>peri) System.out.println("yes");
//        else System.out.println("not");

        System.out.print("enter x ");
        int x=sc.nextInt();

        System.out.print("enter y ");
        int y=sc.nextInt();

        if(x>0) {
            if (y > 0) {
                System.out.println("1st quadrant");
            } else {
                System.out.println("2nd quadrant");
            }
        }else{
                if (y > 0) {
                    System.out.println("4st quadrant");
                }
                else{
                    System.out.println("3nd quadrant");
                }

        }
//        if(x>0 && y>0) System.out.println("1st quadrant");
//        else if(x>0 && y<0) System.out.println("2md quadrant");
//        else if(x<0 && y>0) System.out.println("4th quadrant");
//        else System.out.println("3 quadrant");


    }
}
