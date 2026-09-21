package a4_pattern;

public class square {
    public static void main(String []arg) throws Exception{
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i==j || (i+j)==3)
                System.out.print("*"+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }        
    }
}
