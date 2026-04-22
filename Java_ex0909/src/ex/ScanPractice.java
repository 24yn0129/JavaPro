package ex;

import java.util.Scanner;

public class ScanPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("文字列を入力してください：");
            String input = scanner.nextLine();

            // quitが入力されたらループを抜ける
            if (input.equals("quit")) {
                System.out.println("プログラムを終了します");
                break;
            }

            System.out.println("入力された値は、『" + input + "』です。");
        }

        scanner.close();
    }
}