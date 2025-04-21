/**
 * The code defines an abstract class A with abstract methods show() and config(), and demonstrates
 * the use of an anonymous inner class to implement these methods and create an object of type A.
 */
abstract class A {
    public abstract void show();

    public abstract void config();

}

//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B show");
//	}
//}


public class Anonymous_Inner_Class {
    public static void main(String[] args) {

//    	A obj=new B();

        A obj = new A() {
            public void show() {
                System.out.println("in new show");
            }

            public void config() {
                System.out.println("in config");
            }
        };
        obj.show();
        obj.config();
    }
}