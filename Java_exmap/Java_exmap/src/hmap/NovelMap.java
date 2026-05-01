package hmap;

import java.util.HashMap;
import java.util.Map;

/**
 * 小説の紹介.
 * @author N.Hamano
 *
 */
public class NovelMap {
    private Map<String, Novel> hm = new HashMap<>();

    /**
     * Map挿入.
     * @param novel 小説
     */
    public void putNovel(Novel novel) {
        // 何か足りない
    }

    /**
     * 入力されたタイトルの小説紹介.
     * @param title 題名
     * @throws NullPointerException 存在しない題名の場合
     */
    public void showNovels(String title) throws NullPointerException {
        Novel novel = hm.get(title);

        // 何か足りない
    }
}