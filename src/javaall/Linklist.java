package javaall;
import java.util.*;
public class Linklist {
    public static void main(String[]args)
    {
        LinkedList<String> l= new LinkedList<String>();
        l.add("A");
        l.addFirst("B");
        System.out.println(l);
        l.addLast("C");
        System.out.println(l);
        l.remove("A");
        System.out.println(l);
        l.removeFirst();
        System.out.println(l);
        l.add("A");
        l.removeLast();
        System.out.println(l);
    }
}
