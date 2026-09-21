package HashMap_HashSet;

import java.util.HashMap;

public class Annagram {
    public static void main(String[] args) {
        String s="Onkar Tekmale";
        String t="raknO";
        HashMap<Character,Integer>smap=new HashMap<>();
        HashMap<Character,Integer>tmap=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!smap.containsKey(ch)){
                int val=smap.get(ch);
                smap.put(ch,val+1);
            }
        }

        for(char ch:smap.keySet()){
            if(!tmap.containsKey(ch)){
                System.out.println(false);
                break;
            }
            int val=smap.get(ch);

        }

    }
}
