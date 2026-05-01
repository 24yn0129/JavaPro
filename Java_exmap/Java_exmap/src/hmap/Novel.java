package hmap;

/**
 * 小説クラス.
 * @author N.HAMANO
 *
 */
public class Novel {

    /**
     * 題名.
     */
    private String title;

    /**
     * 著者.
     */
    private String auther;

    /**
     * 出だし.
     */
    private String content;

    /**
     * フィールドを利用したコンストラクタ.
     * @param title 題名
     * @param auther 著者
     * @param content 出だし（概要）
     */
    public Novel(String title, String auther, String content) {
        this.title = title;
        this.auther = auther;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    /**
     * 小説の説明を表示する.
     */
    public void showNovel() {
        System.out.println("「" + this.title + "」の作者は、" + this.auther + "です。");
        System.out.println("その書き出しは、「" + this.content + "」");

    }

    @Override
    public String toString() {
        return "Novel [title=" + title + ", auther=" + auther + ", content=" + content + "]";
    }
}
