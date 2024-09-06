/*
-> Methods are abstract by default; Java 8, can have default and static methods.
-> Multiple inheritance can be achieved through interfaces.
-> Variables are implicitly public, static, and final (constants).
-> Those concrete class which implements interfaces methods must be public 
-> Methods and properties are implicitly public.
-> Functional Interface means a interface having only one abstract method.
*/
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
