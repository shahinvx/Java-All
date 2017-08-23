package javaall;

public class Bicycle1 {
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
