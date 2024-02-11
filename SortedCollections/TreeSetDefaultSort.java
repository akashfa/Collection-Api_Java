import java.util.TreeSet;
public class TreeSetDefaultSort {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<Integer>();
        t.add(11);
        t.add(9);
        t.add(12);
        t.add(8);
        t.add(10);
        System.out.println("Default Sorting::"+t);//[8, 9, 10, 11, 12]
    }
}
