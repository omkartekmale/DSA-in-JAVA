package recusion;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void sunsett(int i,String s,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        sunsett(i+1,s,ans);
        sunsett(i+1,s,ans+s.charAt(i));


    }

    public static void main(String[] args) {
        String s="1234";
        sunsett(0,s," ");
    }
}
