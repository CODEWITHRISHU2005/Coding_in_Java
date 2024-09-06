package org.classfiles;
// Interface can have abstract method & from java_8 can have default and static method.
// Those class which implements all methods of interface there implemented methods must be declare as public.
// Data members are implicitly public, static and final (constants) by default.
// Variables in interface are static and final by deafault.
// Object cannot be created for interface.
// Multiple inheritance can only be achieve through interfaces.


interface Bicycle{
    void applyBrake(int decrement);
    void speedUP(int increment);
}
interface AdvBicycle{
    void applyDisBrake();
    void nitrospeedUP();
}
class AvonCycle implements Bicycle,AdvBicycle{
    void blowHorn() {
        System.out.println("Pee pee... po po...");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake..");
    }
    public void speedUP(int increment){
        System.out.println("Speed up...");
    }
    public void applyDisBrake(){
        System.out.println("Be alert...");
    }
    public void nitrospeedUP() {
        System.out.println("Buy-Buy everyone...");
    }
}
public class Interface {
    public static void main(String[] args) {
        AvonCycle obj = new AvonCycle();
        obj.applyBrake(1);
        obj.speedUP(5);
        obj.applyDisBrake();
        obj.nitrospeedUP();
    }
}
