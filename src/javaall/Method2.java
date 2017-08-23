package javaall;
import java.util.*;
public class Method2 {
    static int add(int x, int y) //public static int add()
    {
        int result = x+y;
        return result;
    }
    static int sub(int x, int y)
    {
        int res = x-y;
        return res;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        a = s.nextInt();
        b = s.nextInt();
        //Method2 m = new Method2();
        c=add(a,b);
        System.out.println("add "+c);
        //m.sub(a, b);
        System.out.println("sub "+sub(a,b));
    }
    
}
