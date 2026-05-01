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

        // 4つ分のテーブルを配列で用意します
        Table[] tables = new Table[4];
        for (int i = 0; i < tables.length; i++) {
            tables[i] = new Table(menu);
        }

        // try-with-resources文でScannerを宣言します（自動でcloseされます）
        try (Scanner sc = new Scanner(System.in)) {
            boolean isRunning = true;
            
            // アプリケーションのメインループ
            while (isRunning) {
                System.out.println("●操作を選んでください");
                System.out.println(" - m: メニュー表示");
                System.out.println(" - o: オーダー追加");
                System.out.println(" - e: テーブル精算");
                System.out.println(" - s: 全テーブル注文ステータス表示");
                System.out.println(" - q: 終了");
                System.out.print(">>>");
                
                String command = sc.nextLine();

                // 入力されたコマンドに応じて処理を分岐します
                switch (command) {
                    case "m":
                        System.out.println("■■■メニュー表示■■■");
                        menu.show();
                        break;
                    case "o":
                        System.out.println("■■■オーダー追加■■■");
                        addOrderProcess(sc, tables, menu);
                        break;
                    case "e":
                        System.out.println("■■■テーブル精算■■■");
                        checkoutProcess(sc, tables);
                        break;
                    case "s":
                        System.out.println("■■■全テーブル注文ステータス表示■■■");
                        showAllTables(tables);
                        break;
                    case "q":
                        System.out.println("■■■終了■■■");
                        System.out.println("お仕事お疲れ様でした");
                        isRunning = false;
                        break;
                    default:
                        System.out.println("ERROR: 無効な入力です");
                        break;
                }
            }
        }
    }

    /**
     * オーダー追加の一連の処理を行います。
     * @param sc Scannerインスタンス
     * @param tables テーブルの配列
     * @param menu メニューインスタンス
     */
    private static void addOrderProcess(Scanner sc, Table[] tables, Menu menu) {
        while (true) {
            System.out.print("テーブル No を0〜3の中から指定してください（c:キャンセル）\n>>>");
            String tInput = sc.nextLine();

            if (tInput.equals("c")) {
                break;
            }

            try {
                int tableNo = Integer.parseInt(tInput);
                
                // テーブル番号が配列の範囲外だった場合のエラー処理
                if (tableNo < 0 || tableNo >= tables.length) {
                    System.out.println("ERROR: 無効な入力です");
                    continue;
                }

                while (true) {
                    System.out.print("メニューの商品番号を指定してください（m:メニュー表示/c:キャンセル）\n>>>");
                    String iInput = sc.nextLine();

                    if (iInput.equals("c")) {
                        break;
                    } else if (iInput.equals("m")) {
                        System.out.println("■■■メニュー表示■■■");
                        menu.show();
                        continue;
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
    }

    /**
     * テーブル精算の一連の処理を行います。
     * @param sc Scannerインスタンス
     * @param tables テーブルの配列
     */
    private static void checkoutProcess(Scanner sc, Table[] tables) {
        while (true) {
            System.out.print("テーブル No を0〜3の中から指定してください（c:キャンセル）\n>>>");
            String pInput = sc.nextLine();

            if (pInput.equals("c")) {
                break;
            }

            try {
                int pTableNo = Integer.parseInt(pInput);
                
                // テーブル番号が配列の範囲外だった場合のエラー処理
                if (pTableNo < 0 || pTableNo >= tables.length) {
                    System.out.println("ERROR: 無効な入力です");
                } else {
                    tables[pTableNo].payOrder();
                    // 精算が成功したらループを抜けてメインメニューに戻ります
                    break; 
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: 無効な入力です");
            }
        }
    }

    /**
     * 全テーブルの注文ステータスを表示します。
     * @param tables テーブルの配列
     */
    private static void showAllTables(Table[] tables) {
        for (int i = 0; i < tables.length; i++) {
            System.out.println("======== テーブル No. " + i + " ========");
            tables[i].showOrder();
        }
    }
}

