package javaall;
import java.util.*;
public class Arraylist {

    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        System.out.println("Initial Size = "+al.size());
        al.add("A");
        al.add("C");
        al.add("D");
        System.out.println(al);
        al.add(1,"B");
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
        al.remove("B");
        System.out.println(al);
        /*************************** pointing arraylist with the help of an iterator *****/
        Iterator<String> itr=al.iterator();
        int counter=0;
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(al);
    }
    
}
