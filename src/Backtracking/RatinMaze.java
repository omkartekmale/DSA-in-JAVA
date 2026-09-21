package Backtracking;

public class RatinMaze {
    public static int Path(int r,int c,int er,int ec,String s,Boolean[][]visited){
        if(r==ec && c==ec){
            System.out.println(s);
            visited[r][c]=false;
            return 1;
        }

        if(c>er||r>ec||r<0||c<0|| visited[r][c]) return 0;
        
        int left=Path(r,c-1,er,ec,s+"L",visited);
        int up=Path(r-1,c,er,ec,s+"L",visited);
        int right=Path(r,c+1,er,ec,s+"L",visited);
        int down=Path(r+1,c,er,ec,s+"L",visited);
        visited[r][c]=false;
        return left+up+right+down;
    }
    public static void main(String[] args) {
        int m=3;
        int n=3;
        Boolean[][]visited=new Boolean[m][n];
        int ans=Path(0,0,m-1,n-1,"",visited);
        System.out.println(ans);
    }
}
