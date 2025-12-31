package recusion;

import java.util.ArrayList;
import java.util.List;

public class binarystrings {
    static List<String> ans;
    public static void gene(int n,String s){
         if(s.length()==n){
             ans.add(s);
             return;
         }
         if(s.endsWith("0")) {
             gene(n, s + "0");
             gene(n, s + "1");
         }
         else{
             gene(n, s + "0");
         }
    }
    public static void main(String[] args) {
       ans=new ArrayList<>();
        gene(3,"");
        System.out.println(ans);
    }
}
