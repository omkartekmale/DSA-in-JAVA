package recusion;

public class CountAndSay {
    public static String CandS(int n){
        if(n==1) return "1";
        String s=CandS(n-1)+"@";
        String ans="";
        int i=0,j=0;
        while (j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else {
                int len=j-i;
                ans+=len;
                ans+=s.charAt(i);
                i=j;
            }

        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(CandS(5));
    }
}
