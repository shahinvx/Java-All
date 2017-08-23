package javaall;
import java.util.*;
class Add{
    void add(Calculator_class c)
    {
        c.result=c.i+c.j;
    }
}
class sub{
    void sub(Calculator_class l)
    {
        l.result=l.i-l.j;
    }
}
class div{
    void div(Calculator_class m)
    {
        m.result=(double)m.i/m.j;
    }
}
public class Calculator_class {
    int i,j;
    double result;
    void set()
    {
        Scanner s=new Scanner(System.in);
        i=s.nextInt();
        j=s.nextInt();
    }
    void show()
    {
        System.out.println("RESULt : "+result);
    }
    public static void main(String[] args) {
        System.out.println("CALCULATOR CLASS");
        Calculator_class c=new Calculator_class();
        c.set();
        
        Add a=new Add();
        a.add(c);
        c.show();
        
        sub b=new sub();
        b.sub(c);
        c.show();
        
        div d=new div();
        d.div(c);
        c.show();
    }
    
}
