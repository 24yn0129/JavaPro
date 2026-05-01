package ordersystem;

import java.util.Scanner;

/**
 * 飲食店オーダーシステムの実行用クラスです。
 */
public class Main {
    /**
     * プログラムのエントリポイントです。
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add(new Item("チーズINハンバーグ", 680));
        menu.add(new Item("ミックスフライ", 650));
        menu.add(new Item("シーフードドリア", 550));
        menu.add(new Item("和風明太パスタ", 450));
        menu.add(new Item("ミックスピザ", 520));
        
        menu.show();

        Table table = new Table(menu);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("◇オーダー追加");
            System.out.print("メニューの商品番号を指定してください（c:キャンセル）\n>>>");
            
            String input = scanner.nextLine();

            if (input.equals("c")) {
                break;
            }

            try {
                int itemNo = Integer.parseInt(input);
                table.addOrder(itemNo);
            } catch (NumberFormatException e) {
                System.out.println("ERROR: 無効な入力です");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR: 無効な入力です");
            }
        }

        System.out.println("◇テーブルの注文履歴を表示する");
        table.showOrder();
        
        System.out.println();
        
        System.out.println("◇テーブルの注文を精算する");
        table.payOrder();
        
        System.out.println();
        
        System.out.println("◇テーブルの注文履歴を表示する");
        table.showOrder();

        scanner.close();
    }
}
