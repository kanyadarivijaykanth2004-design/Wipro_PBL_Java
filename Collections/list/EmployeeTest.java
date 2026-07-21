package Collections.list;

public class EmployeeTest {
    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101, "vijaykanth", "vijaykanth@gmail.com", "Male", 100000);
        Employee e2 = new Employee(102, "Rahul", "rahul@gmail.com", "Male", 45000);

        db.addEmployee(e1);
        db.addEmployee(e2);

        e1.getEmployeeDetails();

        System.out.println();
        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(102);

        System.out.println("\nEmployee with ID 102 deleted.");
    }
}