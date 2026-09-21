package aa1Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<3;i++){
            int x=sc.nextInt();
            arr.add(x);
        }
        System.out.println(arr);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        arr.set(0,50);
        Collections.reverse(arr);
        System.out.println(arr);


    }
}
