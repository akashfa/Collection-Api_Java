import java.util.*; 
class MyComparator implements Comparator{
    @Override
    public int compare(Object obj1,Object obj2){
        Integer a=(Integer)obj1;
        Integer b=(Integer)obj2;
        // return a.compareTo(b);
        //using ternary operators
        return (a<b)?-1:(a>b)?+1:0;
    }

}
public class ArrayListCustomizeSort {
    public static void main(String[] args) {
     ArrayList<Integer>al=new ArrayList();
      al.add(10);
      al.add(12);
      al.add(7);
      al.add(13);
      al.add(6);
      System.out.println("Before sorting list:: "+al);//[10, 12, 7, 13, 6]
      //Collections class using sort method
      // customize sorting using comparator interface
      Collections.sort(al,new MyComparator());
      System.out.println("After sorting list:: "+al);//[6, 7, 10, 12, 13]


    }
}
