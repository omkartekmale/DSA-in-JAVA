package SitringBuilder;

import Linked_List1.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        String s="daccad";
        List<Character> arr=new ArrayList<>();
        int n=s.length();
        for(int i=0;i<n/2;i++){
            arr.add(s.charAt(i));
        }
        Collections.sort(arr);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.size();i++){
            sb.append(arr.get(i));
        }
        for(int i=arr.size()-1;i>=0;i--){
            sb.append(arr.get(i));
        }
        System.out.println(sb);
    }
}
