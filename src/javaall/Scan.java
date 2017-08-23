package javaall;
import java.util.*;
public class Scan {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A number");
        int a,b,c;
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;
        System.out.println("result ="+ c);
    }
    
}
