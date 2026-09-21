package aa1Practice;

public class Demo {
    public static void main(String[] args) {
        int [] arr={1,2,3,2,1};
        // copy     1 2 3 2 1
        int n=arr.length;

        boolean flag=true;

        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-1-i]){ // i=1 (5-1)-i
                flag=false;
                break;
            }
        }

        if(flag)System.out.println("Yes");
        else System.out.println("No");
    }
}
