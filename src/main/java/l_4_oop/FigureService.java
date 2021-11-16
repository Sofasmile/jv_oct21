package l_4_oop;

public class FigureService {
    private Shape shape;

    public FigureService(Shape shape) {
        this.shape = shape;
    }

    public void getInfo() {
        System.out.println("The area is " + shape.getSquare());
    }
}
