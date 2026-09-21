package aa1Practice;

import java.util.Scanner;

public class StringBuilderr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        StringBuilder sb=new StringBuilder(s);

//        for(int i=0;i<sb.length();i++){
//            char ch=sb.charAt(i);
//            if((int)ch>=65 && (int)ch<90){
//                int x=(int)ch;
//                x+=32;
//                sb.setCharAt(i,(char)x);
//            }
//            else{
//            int x=(int)ch;
//            x-=32;
//            sb.setCharAt(i,(char)x);
//        }
//        }
        String s2=sc.nextLine();
        sb.append(s2);

        sb.insert(2,'Z');

        sb.reverse();
       int i=0;
       String ans="";
       while(i<sb.length()){
           if(s.charAt(i)==' ') {
               System.out.println(ans);
               ans="";
           }
           else{
               char ch=sb.charAt(i);
               ans+=ch;
           }
       }
        System.out.println(sb);



    }
}
