package ex;
public class EmployeeTest {
    public static void main(String[] args) {
        //Employeeの生成と情報セット
        Employee employee = new Employee("田中一郎","総務部");
        employee.showEmployeeInfo();
        
        System.out.println(); // 出力結果を見やすくするための改行

        //Managerの生成と情報セット
        Manager manager = new Manager("鈴木二郎","営業部","部長");
        manager.showEmployeeInfo(); // 親クラス（employee）のメソッドで名前と部署を表示
        manager.showPostInfo();     // Managerのメソッドで役職を表示
    }
}