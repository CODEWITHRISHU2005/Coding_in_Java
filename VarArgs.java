/**
 * The VarArgs class in Java demonstrates the use of variable arguments (varargs) to calculate the sum
 * of integers passed as arguments.
 */
public class VarArgs {
    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1, 6));
        System.out.println(sum(8));
    }
}
