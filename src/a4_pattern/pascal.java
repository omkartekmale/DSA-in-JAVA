package a4_pattern;

public class pascal {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            int c=1;
            for(int k=0;k<=i;k++){
                System.out.print(c+" ");
                c=c*(i-k)/(k+1);
            }
            System.out.println();
        }
    }
}
