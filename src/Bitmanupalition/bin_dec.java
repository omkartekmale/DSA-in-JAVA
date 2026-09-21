package Bitmanupalition;

import java.util.ArrayList;

public class bin_dec {
    public static void main(String[] args) {
        String s="1010";
        int sum=0;
        int x=1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1') sum+=x;
            x*=2;
        }
        System.out.println(sum);
        System.out.println(5|9);
        System.out.println(0|1);
        System.out.println(1|1);
        ArrayList<Integer> arr=new ArrayList<>();

    }
}
