import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("佐藤加奈子", "総務部"));
        list.add(new Employee("小林健司", "システム開発部"));
        list.add(new Employee("鈴木直美", "経理部"));
        list.add(new Employee("佐藤進", "営業部"));
        list.add(new Employee("山田幸太郎", "企画部"));

        // 個別アクセス
        System.out.print("1つ目の要素へのアクセス→");
        list.get(0).showEmployeeInfo();
        System.out.print("4つ目の要素へのアクセス→");
        list.get(3).showEmployeeInfo();
        System.out.println();

        // 全要素アクセス
        System.out.println("すべての要素を先頭から順にアクセス");
        for (Employee e : list) {
            e.showEmployeeInfo();
        }
        System.out.println();

        // 要素の変更
        System.out.println("1つ目の要素の部署を変更する");
        list.get(0).setSection("システム開発部");
        System.out.print("1つ目の要素へのアクセス（部署変更後）→");
        list.get(0).showEmployeeInfo();
    }
}