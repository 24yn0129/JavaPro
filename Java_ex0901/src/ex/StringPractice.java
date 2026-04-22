package ex;

public class StringPractice {
    public static void main(String[] args) {
        // コマンドライン引数から二つの文字列を取得
        String str1 = args[0];
        String str2 = args[1];

        System.out.println("一つ目の文字列：" + str1);
        System.out.println("二つ目の文字列：" + str2);

        // 文字列の内容が等しいか判定
        if (str1.equals(str2)) {
            System.out.println("二つの文字列は等しい。");
        } else {
            System.out.println("二つの文字列は等しくない。");
        }
    }
}