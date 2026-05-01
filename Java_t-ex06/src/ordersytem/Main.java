package ordersytem;

import java.util.Scanner;

/**
 * 飲食店オーダーシステムの実行用クラスです.
 */
public class Main {
    /**
     * プログラムのエントリポイントです.
     * @param args コマンドライン引数.
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add(new Item("チーズINハンバーグ", 680));
        menu.add(new Item("ミックスフライ", 650));
        menu.add(new Item("シーフードドリア", 550));
        menu.add(new Item("和風明太パスタ", 450));
        menu.add(new Item("ミックスピザ", 520));
        
        menu.show();

        // 4つ分のテーブルを配列で用意します.
        Table[] tables = new Table[4];
        for (int i = 0; i < tables.length; i++) {
            tables[i] = new Table(menu);
        }

        // try-with-resources文でScannerを宣言します（自動でcloseされます）.
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("◇テーブルを指定して注文を追加する");
            
            // テーブル選択のループ（外側のループ）.
            while (true) {
                System.out.print("テーブル No を0〜3の中から指定してください（c:キャンセル）\n>>>");
                String tInput = sc.nextLine();

                if (tInput.equals("c")) {
                    break;
                }

                try {
                    int tableNo = Integer.parseInt(tInput);
                    
                    // テーブル番号が0〜3の範囲外だった場合のエラー処理.
                    if (tableNo < 0 || tableNo > 3) {
                        System.out.println("ERROR: 無効な入力です");
                        continue;
                    }

                    // 商品選択のループ（内側のループ）.
                    while (true) {
                        System.out.print("メニューの商品番号を指定してください（c:キャンセル）\n>>>");
                        String iInput = sc.nextLine();

                        if (iInput.equals("c")) {
                            break;
                        }

                        try {
                            int itemNo = Integer.parseInt(iInput);
                            tables[tableNo].addOrder(itemNo);
                        } catch (NumberFormatException e) {
                            System.out.println("ERROR: 無効な入力です");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("ERROR: 無効な入力です");
                        }
                    }

                } catch (NumberFormatException e) {
                    System.out.println("ERROR: 無効な入力です");
                }
            }

            // 全テーブルのステータスを表示（追加した別メソッドを呼び出します）.
            showAllTables(tables);

            System.out.println();

            System.out.println("◇テーブルを指定して注文を精算する");
            System.out.print("テーブル No を0〜3の中から指定してください（c:キャンセル）\n>>>");
            String pInput = sc.nextLine();

            if (!pInput.equals("c")) {
                try {
                    int pTableNo = Integer.parseInt(pInput);
                    
                    if (pTableNo < 0 || pTableNo > 3) {
                        System.out.println("ERROR: 無効な入力です");
                    } else {
                        tables[pTableNo].payOrder();
                    }
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: 無効な入力です");
                }
            }

            System.out.println();

            // 精算後の全テーブルステータスを表示.
            showAllTables(tables);
        }
    }

    /**
     * 全テーブルの注文ステータスを表示します.
     * @param tables テーブルの配列.
     */
    private static void showAllTables(Table[] tables) {
        System.out.println("◇全テーブルの注文ステータスを表示する");
        for (int i = 0; i < tables.length; i++) {
            System.out.println("======== テーブル No. " + i + " ========");
            tables[i].showOrder();
        }
    }
}
