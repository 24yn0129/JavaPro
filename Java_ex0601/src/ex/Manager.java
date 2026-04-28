// extends Employee でEmployeeクラスの機能を継承します
package ex;

public class Manager extends Employee {
    private String post;

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void showPostInfo() {
        System.out.println("役職：" + post);
    }
}