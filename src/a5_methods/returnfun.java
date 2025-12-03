package a5_methods;

public class returnfun {
    //if returns
    //else return atleast -1;
    public static int fact(int a){
        int fact =1;
        for(int i=2;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    public static int ncr(int n,int r){
        int pfact=fact(n);
        int rfact=fact(r);
        int nr=n-r;
        int nrfact=fact(nr);
        int result=pfact/(rfact*nrfact);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(ncr(7,3));
    }
}
