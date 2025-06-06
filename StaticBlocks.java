// First Static then Constructor and then Method will execute.
// If we don't create obj then static block will not be executed.
// When a class is loaded then static block will get executed but not constructor.
class Laptop {
    static String name;

    static {
        name = "Apple_MacBook";
        System.out.println("Static block executed");
    }

    String brand;
    int price;

    public Laptop() {
        brand = "";
        price = 60000;
        System.out.println("Constructor executed");

    }

    public static void print(Laptop obj) {
        System.out.println(obj.brand + ":" + obj.name + ":" + obj.price);
    }

    public void show() {
        System.out.println(brand + ":" + name + ":" + price);
    }
}

public class StaticBlocks {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Laptop");//->This will load a class
        //Laptop obj1 = new Laptop();
        // obj1.brand = "DELL";
        // obj1.price = 50000;
        // obj1.name = "Inspiron 3520";
        // Laptop.print(obj1);
        // obj1.show();
    }
}

