/*
-> If we make variable as final then we cannot change the value.
-> If we make class as final then we are just stopping inheritance no one can inherit my class.
-> If we make method as final then we are just stopping method overriding no one can override my method.
*/
class Calc {
    public int divide(int a, int b) {
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

class AdvCalc extends Calc {
    public void scientificCalc() {
        System.out.println("Adv Math calculator");
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class Final {
    public static void main(String[] args) {
        // final int num = 7;
        // num = 6;
        // System.out.println(num);
        AdvCalc cal = new AdvCalc();
        System.out.println(cal.add(5, 6));
        System.out.println(cal.subtract(7, 5));
        System.out.println(cal.multiply(2, 4));
        System.out.println(cal.divide(10, 2));
        cal.scientificCalc();
    }
}
