public class Manager extends Employee {
	private String post;

	// コンストラクタ
	public Manager(String name, String section, String post) {
		// 親クラス（Employee）のコンストラクタを呼び出す
		super(name, section);
		this.post = post;
	}

	public void showPostInfo() {
		System.out.println("役 職 ： " + this.post);
	}

	// Getter/Setter (必要に応じて追加)
	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}
}