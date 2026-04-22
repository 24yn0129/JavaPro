package ex;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("田中一郎", "総務部");
        employee.showEmployeeInfo();
        
        System.out.println(); // 見やすくするための空行です
        
        Manager manager = new Manager("林花子", "システム部", "部長");
        manager.showEmployeeInfo();
    }
}