// Anonymous Object is a object which don't have a reference & only call once at a time
// if we try to call once more then thrn new object will created in heap memory.
package org.classfiles;

class A {
    public A() {
        System.out.println("Object Created");
    }
    public void show() {
        System.out.println("A show");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        new A().show(); //-> Anonymous Object 
        new A().show();
    }
}

