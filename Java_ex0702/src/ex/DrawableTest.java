package ex;
public class DrawableTest {
    public static void main(String[] args) {
    	//インスタンス化
        Drawable rectangle = new Rectangle(3, 5);
        rectangle.draw('+');

        System.out.println();//改行
        
        //インスタンス化
        Drawable horizontalLine = new HorizontalLine(20);
        horizontalLine.draw('*');
    }
}