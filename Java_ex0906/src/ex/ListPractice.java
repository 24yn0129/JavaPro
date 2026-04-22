package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        // 整数のListを生成
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(9);

        // 先頭から表示
        System.out.print("すべての要素を先頭から表示：");
        for (int i : list) System.out.print(i);
        System.out.println();

        // 逆順にして表示
        Collections.reverse(list);
        System.out.print("すべての要素を最後尾から表示：");
        for (int i : list) System.out.print(i);
        System.out.println();
    }
} 