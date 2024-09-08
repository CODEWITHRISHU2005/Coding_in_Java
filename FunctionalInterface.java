// @Functional Interface-> having only one abstract method.
// @Normal interface-> having two or more abstract method.
// @Marker interface-> having no abstract method.
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
