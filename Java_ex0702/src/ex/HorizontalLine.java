package ex;
public class HorizontalLine implements Drawable {
    private int length;

    public HorizontalLine(int length) {
        this.length = length;
    }

    @Override
    public void draw(char c) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}