package pattern.Decorator;

public class DecoratorClient {
    public static void run() {
        Circle circle = new Circle();
        circle.draw();
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        IShape shape = new Circle();
        shape.draw();
        shape = new Rectangle();
        shape.draw();
        ShapeDecorator decorator = new BlueBorder(circle);
        decorator.draw();
    }
}
