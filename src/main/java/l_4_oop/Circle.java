package l_4_oop;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Double getSquare() {
        System.out.println("Method in class Circle");
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{"
                + "radius=" + radius
                + '}';
    }
}
