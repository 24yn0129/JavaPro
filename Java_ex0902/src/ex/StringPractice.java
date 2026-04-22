package ex;

public class StringPractice {
    public static void main(String[] args) {
        String[] fruits = { "orange", "banana", "lemon", "apple", "peach" };
        // 検索文字列を取得
        String target = args[0];
        int foundIndex = -1;

        // 配列内をループして検索
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                foundIndex = i;
                break;
            }
        }

        // 検索結果の表示
        if (foundIndex != -1) {
            System.out.println("検索文字列『" + target + "』が、配列のインデックス番号" + foundIndex + "に見つかりました。");
        } else {
            System.out.println("検索文字列『" + target + "』が、配列中に見つかりませんでした。");
        }
    }
}