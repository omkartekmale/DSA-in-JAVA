package String;

public class MaxChar {
    public static void main(String[] args) {
        String s="aaaaaaaddbbbbube";
        int [] ans=new int[26];
        for(int i=0;i<s.length();i++){
            int x=(int)s.charAt(i);
            x-=97;
            ans[x]+=1;
        }
        int max=0;
        char ch=' ';
        for(int i=0;i<26;i++){
            if(ans[i]>max){
                max=ans[i];
                ch=(char)(i+97);
            }
        }
        System.out.println(max+" "+ch);
    }
}
