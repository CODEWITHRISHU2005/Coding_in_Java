class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class Throw_Throws {
    public static double areaCircle(int rad) throws NegativeRadiusException {
        if (rad < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * rad * rad;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        try {
            int c = divide(6, 0);
            System.out.println(c);
            // double area = areaCircle(-4);
            // System.out.println(area);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
