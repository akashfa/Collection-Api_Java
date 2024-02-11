import java.util.TreeMap;


public class TreeMapCustomizeSorting {
    public static void main(String[] args) {
        //using Lambda Expression
        TreeMap<Integer,String> tm=new TreeMap<Integer,String>((k1,k2)->-k1.compareTo(k2));
       
        tm.put(3,"Akash");
        tm.put(1,"Vikas");
        tm.put(2,"Nitin");
        tm.put(4,"Ritu");
        tm.put(5,"Geeta");

        System.out.println("Customized Sorting:: "+tm);
    }
}
