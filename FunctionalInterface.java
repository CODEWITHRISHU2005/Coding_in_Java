//@FunctionalInterface
interface Project {
    void show();
}
public class FunctionalInterface {
    public static void main(String[] args) {
        Project obj = new Project() {
            public void show() {
                System.out.println("My Project is");
            }
        };
        obj.show();
    }
}
