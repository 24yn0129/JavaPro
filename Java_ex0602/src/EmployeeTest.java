public class EmployeeTest {
	public static void main(String[] args) {
		// Employeeのインスタンス化
		Employee emp = new Employee("田中一郎", "総務部");//コンストラクタに渡す
		emp.showEmployeeInfo();
		System.out.println(); // 改行

		// Managerのインスタンス化
		Manager mgr = new Manager("林花子", "システム部", "部長");//コンストラクタに渡す
		mgr.showEmployeeInfo(); // 親から継承したメソッド
		mgr.showPostInfo(); // 自分のメソッド
	}
}