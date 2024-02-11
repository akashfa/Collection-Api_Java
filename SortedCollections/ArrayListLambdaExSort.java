import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLambdaExSort {
    public static void main(String[] args) {
    ArrayList<Integer>al=new ArrayList();
      al.add(10);
      al.add(12);
      al.add(7);
      al.add(13);
      al.add(-9);
      System.out.println("Before sorting list:: "+al);//[10, 12, 7, 13, 6]
      //Collections class using sort method
      // customize sorting using Lambda Expression
      Collections.sort(al,(a,b)->a.compareTo(b));
      System.out.println("After sorting list:: "+al);//[6, 7, 10, 12, 13]
    }
}
