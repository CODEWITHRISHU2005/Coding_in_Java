/*
-> If we make a variable static then all object is referring to that variable showing below code.
-> We can use static variables inside a static methods but we can't use non static variables inside a static methods?
-> Because har ek instance variable ke liye alag obj banta hai to unko pata hai kha refer karna hai but static variable call with the help of class reference to usko pta nhi konsa obj ko refer kre is liye.
-> Static method need not to create obj they can directly called by using class reference but non-static method needs to create obj.
*/

class Mobile {
    static String name;
    String brand;
    int price;

    public static void print(Mobile obj) {
        System.out.println(obj.brand + ":" + obj.name + ":" + obj.price);
    }

    public void show() {
        System.out.println(brand + ":" + name + ":" + price);
    }
}

public class StaticFamily {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 50000;
        obj1.name = "Galaxy";

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 100000;
        obj2.name = "I_phone";

        obj1.name = "Snapdragon";
        //obj1.show();
        //obj2.show();
        Mobile.print(obj1);
    }
}
