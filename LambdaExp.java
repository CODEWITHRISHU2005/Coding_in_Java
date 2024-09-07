// Lambda Expression only works with Functional Interface just to avoid confussion.

//@FunctionalInterface
// interface Project {
//     void show(String name);
// }
interface Project {
    int add(int i, int j);
}

public class LambdaExp {
    public static void main(String[] args) {
        // This is called Lambda Expression in which it is internally create obj of A.
        // Project obj = (name) -> System.out.println("My project is:" + name);
        // obj.show("CodeWithRishu");

        Project obj = (i, j) -> i + j;
        System.out.println("The Sum of two Number is: " + obj.add(7, 8));
    }
}