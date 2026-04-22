package ex;

public class Manager extends Employee {
    private String post;

    public Manager(String name, String section, String post) {
        super(name, section); 
        this.post = post;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void showPostInfo() {
        System.out.println("役職：" + post);
    }

    @Override
    public void showEmployeeInfo() {
        super.showEmployeeInfo();
        this.showPostInfo();
    }
}