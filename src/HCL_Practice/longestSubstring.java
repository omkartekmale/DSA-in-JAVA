package HCL_Practice;

import java.util.HashSet;

public class longestSubstring {
    public static void main(String[] args) {
        String s="abcabcbb";

        int maxlength=0;

        for(int i=0;i<s.length();i++){
            HashSet<Character>set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));

                maxlength=Math.max(maxlength, set.size());
            }
        }
        System.out.println(maxlength);
    }
}
