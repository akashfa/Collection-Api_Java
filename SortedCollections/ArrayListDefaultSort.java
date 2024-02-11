import java.util.ArrayList;
import java.util.Collections;

class ArrayListDefaultSort{
    public static void main(String[]args){
      ArrayList<Integer>al=new ArrayList();
      al.add(10);
      al.add(12);
      al.add(7);
      al.add(13);
      al.add(6);
      System.out.println("Before sorting list:: "+al);//[10, 12, 7, 13, 6]
      //using Collections class sort method
      //default sorting
      Collections.sort(al);
      System.out.println("After sorting list:: "+al);//[6, 7, 10, 12, 13]

      

    }
}