package aa1Practice;

public class recurision {
    public static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }
    public static String countsay(int n){
        if(n==1) return "1";
       String s=countsay(n-1)+"@";
       int i=0;
       int j=0;
       String ans="";
       while(j<s.length()){
           if(s.charAt(i)==s.charAt(j)) j++;
           else{
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
        System.out.println(fact(5));
        countsay(1);
        
    }
}
