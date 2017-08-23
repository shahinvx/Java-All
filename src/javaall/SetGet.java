package javaall;
public class SetGet {
    private String name;
    private int age;
    private String natid;
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
        //System.out.println(+age);
    }
    public void setAge(int age)
    {
        this.age = age;
        System.out.println("wow "+this.age);
    }
    public String getNatid()
    {
        return natid;
    }
    public void setNatid(String natid)
    {
        this.natid = natid;
    }
    public static void main(String[] args) {
        SetGet s = new SetGet();
        int k;
        s.age=67;
        s.setAge(45);
        k = s.getAge();
        //System.out.println(+k);
        
    }
    
}
