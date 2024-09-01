public class OOPS {
    public static void main(String[] args) {
        System.out.println("My first custom class:");
        System.out.println();
        Employee rishu = new Employee(); //-> Instantiating a new Employee object
        Employee john = new Employee(); //-> Instantiating a new Employee object

        // Setting attributes for rishu
        rishu.id = 56;
        rishu.salary = 25;
        rishu.name = "Rishabh Gupta";

        // Setting attributes for john
        john.id = 12;
        john.name = "John";
        john.salary = 20;

        // Calling method to print details
        rishu.printDetails(); 
        john.printDetails(); 
    }
}
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
    }
}


