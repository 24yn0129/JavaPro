package ex;
public class Employee {
    private String name;
    private String section;

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

    public void showEmployeeInfo() {
        System.out.println("名前：" + name);
        System.out.println("部署：" + section);
    }
}