/* 
-> There can be a final method in abstract class but any abstract method in class(abstract class) can not be declared as final.
-> We can define static methods in an abstract class and called using name of abstract class.
-> Abstract class have both abstract & non-abstract method(with method bodies) contain constructor also.
-> If we declare class as abstract either we declare implemented method as abstract or we override all abstract method.
-> We can't create object of abstract class but can create reference.
-> Abstract helps to achieve abstraction.
*/
// Abstract class
abstract class Base {
    abstract void fun();
}

class Derived extends Base {
    void fun() {
        System.out.println("Derived fun() called");
    }
}

public class Abstract {
    public static void main(String args[]) {
        // We can have references of Base type.
        Base b = new Derived();
        b.fun();
    }
}
