import java.util.TreeMap;
public class TreeMapDefaultSorting {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
        tm.put(3,"Akash");
        tm.put(1,"Vikas");
        tm.put(2,"Nitin");
        tm.put(4,"Ritu");
        tm.put(5,"Geeta");

        System.out.println("Default Natural Sorting:: "+tm);

    }
}
