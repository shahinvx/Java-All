package javaall;
import java.util.*;
public class Listtoarray{
public static void main(String[]args) {
    ArrayList<Integer> al=new ArrayList<Integer>();
    al.add(1);
    al.add(2);
    al.add(3);
    Integer ai[]=new Integer[al.size()]; // converting list to an array
    ai=al.toArray(ai);
    for(int i=0;i<al.size();i++)
    {
        System.out.println(ai[i]);
    }
}
}
