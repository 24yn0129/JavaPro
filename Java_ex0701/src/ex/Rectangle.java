package ex;
public class Rectangle extends AbstractShape {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return (double) height * width;
    }

    @Override
    public void print() {
        System.out.println("高さ" + getHeight() + "、幅" + getWidth() + "の長方形の面積：" + getArea());
    }
}