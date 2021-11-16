package l_4_oop;

public class Main {
    /**
     * Write the interface Shape with method ```public Double getSquare()```
     * and classes Rectangle and Circle.
     * All these classes should implement the Shape interface.
     * Override method getSquare in corresponding way.
     */
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 3);

        FigureService figureService1 = new FigureService(rectangle);
        figureService1.getInfo();

        FigureService figureService2 = new FigureService(circle);
        figureService2.getInfo();

    }
}
