

class Employee {
    private String name;
    private String section;

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

    public void showEmployeeInfo() {
        System.out.println("名前：" + name + "　部署：" + section);
    }
}