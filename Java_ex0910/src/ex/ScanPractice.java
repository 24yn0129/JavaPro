package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScanPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        while (true) {
            System.out.println("社員情報を登録します。（qで終了）");
            System.out.print("社員名：");
            String name = scanner.nextLine();

            // qが入力されたら登録作業を終了
            if (name.equals("q")) {
                break;
            }

            System.out.print("部署名：");
            String section = scanner.nextLine();
            System.out.println();

            // リストに社員情報を追加
            list.add(new Employee(name, section));
        }

        // 登録された全社員情報の表示
        System.out.println("\n登録された全従業員の情報を表示します。");
        for (Employee e : list) {
            e.showEmployeeInfo();
        }

        scanner.close();
    }
}