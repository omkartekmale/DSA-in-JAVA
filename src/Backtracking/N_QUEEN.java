package Backtracking;

public class N_QUEEN {
    static public void nQueen(int row, char [][]chess){
        int n=chess.length;
        if(row==n){
            for(int i=0;i<n;i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(chess[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int i=0;i<n;i++){
            if(isQueenPlaces(row,i,chess)){
                chess[row][i]='Q';
                nQueen(row+1,chess);
                chess[row][i]='.';
            }
        }
    }
    static public boolean isQueenPlaces(int row,int col,char[][]chess){
        int n= chess.length;
        int i=row-1;
        while(i>=0){
            if(chess[i][col]=='Q') return false;
            i--;
        }
        int r=row-1;
        int c=col-1;
        while(r>=0 && c>=0){
            if(chess[r][c]=='Q') return false;
            r--;
            c--;
        }
        int ro=row-1;
        int co=col+1;
        while(ro>=0 && co<n){
            if(chess[ro][co]=='Q') return false;
            ro--;
            co++;
        }
        return true;
    }

    public static void main(String[] args) {
        int n=5;
        char [][]chess=new char[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                chess[i][j]='.';

        nQueen(0,chess);
    }

}
