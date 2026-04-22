public class DrawableTest {
    public static void main(String[] args) {
        Drawable rectangle = new Rectangle(3, 5);
        rectangle.draw('+');

        System.out.println();

        Drawable horizontalLine = new HorizontalLine(20);
        horizontalLine.draw('*');
    }
}