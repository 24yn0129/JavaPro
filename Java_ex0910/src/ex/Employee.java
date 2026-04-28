package ex;

/**
 * Employeeクラス.
 */
class Employee {

	//name 名前を入れる.
	//section 部署名を入れる.
	private String name;
	private String section;

	/**
	 * コンストラクタ.
	 * @param name 社員名.
	 * @param section 部署名.
	 */

	public Employee(String name, String section) {
		this.name = name;
		this.section = section;
	}

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

	/**
	 * showEmployeeInfo 名前と部署名を表示する.
	 */
	public void showEmployeeInfo() {
	    // %-15s -> 15文字分確保して左詰め
	    // %-15s -> 15文字分確保して左詰め
	    // %n     -> 改行
	    System.out.printf("名前：%-15s 部署：%-15s%n", name, section);
	}

}