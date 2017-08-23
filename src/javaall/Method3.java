package javaall;
import java.util.*;
public class Method3 {
    int add(int x, int y)
    {
        int res = x + y;
        return res;
    }
    int add(int x,int y,int z) //method overloading
    {
        int res = x + y + z;
        return res;
    }
    int sub(int x, int y)
    {
        int res = x - y;
        return res;
    }
    double div(double x, double y)
    {
        double res = x / y;
        return res;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        double k;
        a = s.nextInt();
        b = s.nextInt();
        Method3 m = new Method3();
        
        m.add(a, b);
        k = m.div(a, b);
        
        System.out.println("two method same name " + m.add(a, b, 10));
        System.out.println("div "+k);
        System.out.println("add "+m.add(a, b));
    }
    
}
