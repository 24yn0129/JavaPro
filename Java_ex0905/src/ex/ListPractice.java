package ex;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        // Listの生成と初期要素の追加
        List<String> list = new ArrayList<>();
        list.add("りんご");
        list.add("ばなな");
        list.add("めろん");
        list.add("みかん");
        list.add("ぶどう");

        // 要素の取得
        System.out.println("2つ目の要素：" + list.get(1));
        System.out.println("5つ目の要素：" + list.get(4));
        System.out.println();

        // 全要素表示
        System.out.print("すべての要素を先頭から表示：");
        for (String s : list) System.out.print(s + " ");
        System.out.println();

        // 要素の追加
        boolean isAdded = list.add("もも");
        System.out.println("要素を追加（成功すればtrue）：" + isAdded);

        System.out.print("すべての要素を先頭から表示：");
        for (String s : list) System.out.print(s + " ");
        System.out.println();

        // 要素の削除
        list.remove("めろん");
        System.out.println("要素を削除：めろん");

        System.out.print("すべての要素を先頭から表示：");
        for (String s : list) System.out.print(s + " ");
        System.out.println();

        // 特定の位置に要素を追加
        list.add(1, "びわ");
        System.out.println("特定の位置に要素を追加");

        System.out.print("すべての要素を先頭から表示：");
        for (String s : list) System.out.print(s + " ");
        System.out.println();
    }
}