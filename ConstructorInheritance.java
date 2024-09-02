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
        super(x);
        System.out.println("I am an overloaded derived constructor! with value of y as: " + y);
    }
}

public class ConstructorInheritance {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //Base c = new Base(12);
        Derived d = new Derived(5, 10);
    }
}