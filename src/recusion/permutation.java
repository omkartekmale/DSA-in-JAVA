package recusion;

import java.util.ArrayList;

public class permutation {
    public static void permu(String ans,String s){
        if(s.length()==0){
            System.out.println(ans.toCharArray());
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            permu(ans+ch,left+right);
        }
    }
    public static void main(String[] args) {
        String s="123";
        permu("",s);
        ArrayList<Integer>ne=new ArrayList<>();
    }
}
