package recusion;

import java.util.ArrayList;
import java.util.List;

public class mazepath {
    static int Mazepath(int row,int col,int m,int n,String s){
        if(row==m) {
            s+="d";
            System.out.print(s+" ");
            return 1;
        }
        if( col==n) {
            s+="r";
            System.out.print(s+" ");
            return 1;
        }
        int right=Mazepath(row+1,col,m,n,s+"r");
        int down= Mazepath(row,col+1,m,n,s+"d");
        return right+down;
    }
    public static void main(String[] args) {
        System.out.println( Mazepath(1,1,3,3,""));


    }
}
