public class Employee {
	private String name;
	private String section;

	// コンストラクタ
	public Employee(String name, String section) {
		this.name = name;
		this.section = section;
	}

	public void showEmployeeInfo() {
		System.out.println("名 前 ： " + this.name);
		System.out.println("部 署 ： " + this.section);
	}

	// Getter/Setter (必要に応じて追加)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
}