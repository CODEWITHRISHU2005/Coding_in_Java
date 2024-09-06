package org.classfiles;

class Phone {
    // Whenever object is created using new keyword then method will run at run time.
    // We cannot override static & final methods it produces compile time error.
    // We cannot override a private method & return type should same for overriden method.
    // Overloading is about the same method having different signatures.Overriding is about the same method, and same signature but different classes connected through inheritance. 
    // Method overloading is compile time polymorphism whereas method overriding is runtime polymorphism.
    // In dynamic method dispatch we can run only reference of obj method.

    public void message() {
        System.out.println("Messaging some text!");
    }
    public void call() {
        System.out.println("Calling... in cellular phone");
    }
}

class SmartPhone extends Phone {
    @Override
    public void call() {
        super.call();// This super command helps to run phone call func otherwise if we don't use this then only Smartphone call func runs
        System.out.println("Calling...in SmartPhone");
    }
    public void musicPlayer() {
        System.out.println("Playing music...");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();//->This is dynamic method dispatch or run time polymorphism
        obj.call();       
        obj.message();
        //obj.musicPlayer();->This will produce an error because we can run only superclass data members
    }
}