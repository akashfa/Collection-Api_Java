//Sorting for Customized class objects by using Lambda Expression 

import java.util.ArrayList;
import java.util.Collections;
class Employee{
    int eid;
    String ename;
    Employee(int eid,String ename){
        this.eid=eid;
        this.ename=ename;
    }
    @Override
    public String toString(){
        return eid+" "+ename;
    }

}
public class SortingCustomizeObject {
    public static void main(String[] args) {
        ArrayList<Employee>eal=new ArrayList<Employee>();
        eal.add(new Employee(1,"Akash"));
        eal.add(new Employee(6,"Nitin"));
        eal.add(new Employee(9,"Vikas"));
        eal.add(new Employee(3,"Ritu"));
        eal.add(new Employee(2,"Geeta"));

        System.out.println("Before Sorting::"+eal);//[1 Akash, 6 Nitin, 9 Vikas, 3 Ritu, 2 Geeta]

        //using Lambda Expression sorting based employee ide
        Collections.sort(eal,(e1,e2)->(e1.eid>e2.eid)?-1:(e1.eid<e2.eid)?+1:0);
        System.out.println("After sorting based employee ide:: "+eal);//[9 Vikas, 6 Nitin, 3 Ritu, 2 Geeta, 1 Akash] 

        //using Lambda Expression sorting based employee name
        Collections.sort(eal,(e1,e2)->e1.ename.compareTo(e2.ename));
        System.out.println("After sorting based employee name::"+eal);//[1 Akash, 2 Geeta, 6 Nitin, 3 Ritu, 9 Vikas]
    }
}
