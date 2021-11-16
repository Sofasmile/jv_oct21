package l_4_oop;

public class Rectangle implements Shape {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public Double getSquare() {
        System.out.println("Method in class Rectangle");
        return (double) sideA * sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{"
                + "sideA=" + sideA
                + ", sideB=" + sideB
                + '}';
    }
}
