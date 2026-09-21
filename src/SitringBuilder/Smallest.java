package SitringBuilder;

public class Smallest {
    public static void main(String[] args) {
        String s="cbacdcbc";
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            String ss=""+ch;
            if(sb.indexOf(ss)==-1) sb.append(ss);
            else{
                StringBuilder copy=new StringBuilder(sb);
                int idx=sb.indexOf(String.valueOf(ss));
                sb.deleteCharAt(idx);
                sb.append(ss);
                int xx=sb.compareTo(copy);
                }

            }

        }
    }

