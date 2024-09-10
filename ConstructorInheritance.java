// Agar hum subclass ka object banata hai tab wo sub ka cons run karaga hi but wo super ka default cons bhi run karega
// Why?-> Because in Java even if we don't mention every constructor have super() _ method already in every class.
// Remember even if we don't mention every class in java extends Object class but only superclass at top in case of multiple inheritance.
// this()_ method will execute constructor of same class.
// super()_ method will execute constructor of superclass that of subclass.

class Base {
    Base() {
        System.out.println("I am a base class constructor!");
    }
    Base(int x) {
        System.out.println("I am an overloaded base constructor! with value of x as: " + x);
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("I am a derived class constructor!");
    }
    Derived(int x, int y) {
        this();
        //super(x);
        System.out.println("I am an overloaded derived constructor! with value of y as: " + y);
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        //Base c = new Base(12);
        Derived d = new Derived(5, 6);
    }
}