// @Functional Interface-> having only one abstract method.
// @Normal interface-> having two or more abstract method.
// @Marker interface-> having no abstract method. Ex - Serializable, Cloneable, Remote etc.
// Functional interface can be implemented using lambda expression or anonymous class.
// Functional interface can have any number of default and static methods 
// it can also have abstract methods that override public methods of java.lang.Object (like equals, hashCode, toString).

// Why Comparable Interface is not marked as @FunctionalInterface although it have only one abstract method in Java?

@java.lang.FunctionalInterface
interface Project {
    void show();
}

public class FunctionalInterface {
    public static void main(String[] args) {
        @SuppressWarnings("Convert2Lambda")
        Project obj = new Project() {
            @Override
            public void show() {
                System.out.println("My Project is");
            }
        };
        obj.show();
    }
}
