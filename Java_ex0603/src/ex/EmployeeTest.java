package ex;

public class EmployeeTest {
    public static void main(String[] args) {
    	//employeeクラスのインスタンス化
        Employee employee = new Employee("田中一郎", "総務部");
        employee.showEmployeeInfo();
        
        System.out.println(); // 改行
        
        //managerクラスのインスタンス化
        Manager manager = new Manager("林花子", "システム部", "部長");
        manager.showEmployeeInfo();
    }
}