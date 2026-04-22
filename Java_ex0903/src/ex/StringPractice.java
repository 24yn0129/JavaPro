package ex;

public class StringPractice {
    public static void main(String[] args) {
        String str = "Welcome to Java World!";
        String target = args[0];

        // 指定した文字列の出現位置を検索
        int index = str.indexOf(target);

        if (index != -1) {
            System.out.println("検索文字列『" + target + "』が、文字列のインデックス番号" + index + "に見つかりました。");
        } else {
            System.out.println("検索文字列『" + target + "』が、文字列に見つかりませんでした。");
        }
    }
}