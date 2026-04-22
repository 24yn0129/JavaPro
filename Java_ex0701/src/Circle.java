public class Circle extends AbstractShape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return (double) radius * radius * Math.PI;
    }

    @Override
    public void print() {
        System.out.println("半径" + radius + "の円の面積：" + getArea());
    }
}