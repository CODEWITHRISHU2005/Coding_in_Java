class A {
    int age;
    public void show() {
        System.out.println("in A show");
    }
    class B {
        public void config() {
            System.out.println("in B config");
        }
    }
}

public class Inner_Class {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // In case of inner class static
//        A.B obj1 = new A.B();
//        obj1.config();

        // In case of inner class non-static
        A.B obj1 = obj.new B();
        obj1.config();
    }
}