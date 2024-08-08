package pattern.Decorator;

public class BlueBorder extends ShapeDecorator {

    public BlueBorder(IShape shapeToDecorate) {
        super(shapeToDecorate);
    }

    @Override
    public void draw() {
        System.out.println("Blue");
        shapeToDecorate.draw();
    }
}
