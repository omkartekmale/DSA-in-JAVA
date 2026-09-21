package aa1Practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayL {
    public static void main(String[] args) {

        List<List<Integer>>array=new ArrayList<>();
        int val=1;

      for(int i=0;i<4;i++){
          List<Integer>arr=new ArrayList<>();
          for(int j=0;j<4;j++) arr.add(val++);
          array.add(arr);
      }
     for(int i=0;i<array.size();i++){
         for(int j=0;j<array.get(i).size();j++){
             System.out.print(array.get(i).get(j)+" ");
         }
         System.out.println();
     }
    }
}
