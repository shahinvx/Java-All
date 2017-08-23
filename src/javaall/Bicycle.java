package javaall;
class Bike{
    int cadence = 0, speed = 0, gear = 1;
    void changeCadence(int newValue)
    {
        cadence = newValue;
    }
    void changeGear(int newValue)
    {
        gear = newValue;
    }
    void speedUp(int increment)
    {
        speed = speed + increment;
    }
    void applyBrakes(int decrement)
    {
        speed = speed - decrement;
    }
    void printStates()
    {
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }
}
public class Bicycle {
  
    public static void main(String[] args) {
        Bicycle1 b1 = new Bicycle1();
        Bicycle1 b2 = new Bicycle1();
        Bike b3 = new Bike();
        Bike b4 = new Bike();
        
        b1.changeCadence(50);
        b1.speedUp(10);
        b1.changeGear(2);
        b1.printStates();
        
        b2.changeCadence(50);
        b2.speedUp(10);
        b2.changeGear(2);
        b2.changeCadence(40);
        
        b2.speedUp(10);
        b2.changeGear(3);
        b2.printStates();
        
        System.out.println("In This Script's Class");
        
        b3.changeCadence(50);
        b3.speedUp(10);
        b3.changeGear(2);
        b3.printStates();
        
        b4.changeCadence(50);
        b4.speedUp(10);
        b4.changeGear(2);
        b4.changeCadence(40);
        
        b4.speedUp(10);
        b4.changeGear(3);
        b4.printStates();
    }
    
}
