package javaall;

import java.util.*;
class add{
    int a,b;
    double c,res;
    String st = new String();
    void set()
    {
        
        Scanner s = new Scanner(System.in);
        st = s.next();
        //st = s.nextLine();
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextDouble();
    }
}
public class Scan1 {
    public static void main(String[] args) {
        add d = new add();
        d.set();
        d.res = (double)d.a+d.b+d.c;
        System.out.println("wow "+d.res + " add "+d.st);
        
    }
    
}
