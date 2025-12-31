package recusion;

import java.sql.SQLOutput;

public class SkipaChar {
    public static void Skip(int i,String s,String ans) {

        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        if (s.charAt(i) != 'a') ans+=s.charAt(i);
        Skip(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s="Omkar Tekmale";
        Skip(0,s,"");
    }
}
