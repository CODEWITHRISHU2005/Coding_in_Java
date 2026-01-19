public class Getter_Setter {
    public static void main(String[] args) {
        Employee employee = new Employee();
        //-> Throws an error due to private access modifier 
        // employee.Id = 12;
        // employee.name = "Rishabh Gupta";
        employee.setId(12);
        employee.setName("Rishabh Gupta");
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
    }
}

class Employee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
