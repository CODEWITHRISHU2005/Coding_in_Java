// Finally Block is used to close the resource using Buffered Reader.
// Finally Block mai jo code likha hoga wo har hal mai execute hokar managa exception aye chaha nh aaye.
// Finally Block is not getting executed in case of System.exit() or or Runtime. JVM crash or infinite loop or power failure.

public class FinallyBlock {
    public static int greet() {
        try {
            int a = 50;
            int b = 10;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Cleaning up resources...This is the end of this function");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a = 7;
        int b = 9;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }

        try {
            System.out.println(50 / 3);
        } finally {
            System.out.println("Yes this is finally");
        }
    }
}