public class EmployeeTest {
    public static void main(String[] args) {
        // 1. Employeeの生成と情報セット
        Employee employee = new Employee();
        employee.setName("田中一郎");
        employee.setSection("総務部");
        employee.showEmployeeInfo();
        
        System.out.println(); // 出力結果を見やすくするための改行

        // 2. Managerの生成と情報セット
        Manager manager = new Manager();
        manager.setName("鈴木二郎"); // 親クラスのメソッドが使えます
        manager.setSection("営業部"); // 親クラスのメソッドが使えます
        manager.setPost("部長");      // 自身で定義したメソッドです
        manager.showEmployeeInfo(); // 親クラスのメソッドで名前と部署を表示
        manager.showPostInfo();     // 自身のメソッドで役職を表示
    }
}