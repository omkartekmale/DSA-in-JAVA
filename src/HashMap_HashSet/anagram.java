package HashMap_HashSet;

import java.util.HashMap;

public class anagram {
    public static void main(String[] args) {
        String s="omkar";
        String t="mkarr";
        HashMap<Character,Integer> smap=new HashMap<>();
        HashMap<Character,Integer> tmap=new HashMap<>();

        for(int i=0;i<5;i++){
            char ch=s.charAt(i);
            if(smap.containsKey(ch)){
                int val=smap.get(ch);
                smap.put(ch,val+1);
            }
            else smap.put(ch,1);
        }
        for(int i=0;i<5;i++){
            char ch=t.charAt(i);
            if(tmap.containsKey(ch)){
                int val=tmap.get(ch);
                tmap.put(ch,val+1);
            }
            else tmap.put(ch,1);
        }
        for( char ch:smap.keySet()){
            if(!tmap.containsKey(ch)){
                System.out.println("false");
                break;
            };
            int val1=smap.get(ch);
            int val2=tmap.get(ch);
            if(val1!=val2) {
                System.out.println("false");
                break;
            }
        }
        System.out.println(true);
    }
}
