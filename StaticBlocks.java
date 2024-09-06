class Laptop {
    String brand;
    int price;
    static String name;
    static{
        name = "Apple_MacBook";
        System.out.println("Static block executed");
    }
    public Laptop() {
        brand = "";
        price = 60000;
        System.out.println("Constructor executed");

    }
    public void show() {
        System.out.println(brand + ":" + name + ":" + price);
    }

    public static void print(Laptop obj) {
        System.out.println(obj.brand + ":" + obj.name + ":" + obj.price);
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

