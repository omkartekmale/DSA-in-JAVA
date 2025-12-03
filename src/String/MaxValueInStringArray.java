package String;

public class MaxValueInStringArray {
    public static String maxs(String a,String b){
   String s=purify(a);String t=purify(b);
   if(s.length()>t.length()) return a;
        if(s.length()<t.length()) return b;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>t.charAt(i)) return a;
            else return b;
        }
        if(a.length()<b.length()) return b;
        else return a;


    }
    public static String purify(String pp){
        for(int i=0;i<pp.length();i++){
            if(pp.charAt(i)!=' ') return pp.substring(i);
        }
        return pp;
    }
    public static void main(String[] args) {
        String [] s={"12323","34554","4564777","34322"};
        String maxS=s[0];

        for(int i=0;i<s.length;i++){
            maxS=maxs(maxS,s[i]);
        }
        System.out.println(maxS);
    }
}
