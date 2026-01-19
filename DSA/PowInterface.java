interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile and run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run : Faster");
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class PowInterface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer rishu = new Developer();
        rishu.devApp(desk);
    }
}