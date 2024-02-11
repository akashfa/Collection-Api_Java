//Customize sorting using Comparator interface
//using Lambda Expression
import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetCustomizeSorting {
    public static void main(String[] args) {
        //using Lambda Expression
        TreeSet<Integer> t=new TreeSet<Integer>((a,b)->-a.compareTo(b));
        t.add(11);
        t.add(9);
        t.add(20);
        t.add(8);
        t.add(10);
        System.out.println("Customizeing Sorting::"+t);//[20, 11, 10, 9, 8]
    }
}
