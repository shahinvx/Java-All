package javaall;

public class Const {
    private int id;
    private String name = "Shahin";
    private int age =9;
    
    public Const()
    {
        
    }
    public Const(int id)
    {
        this.id = 7;
        id = 7;
    }
    public Const(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age+8;
        //age = age+age;
        
        System.out.println("age"+this.age);
    }

    public static void main(String[] args) {
        Const c = new Const();
        //String s = "af";
        //c.id = 8;
        c.age = 3;
        //c.Const();
        //Const(8);
        System.out.println("age "+c.age);
        System.out.println("id "+c.id);
        System.out.println("name "+c.name);
    }
    
}
