package pattern.Decorator;

public class DashedBorder extends ShapeDecorator{

    public DashedBorder(IShape shapeToDecorate) {
        super(shapeToDecorate);
    }

    @Override
    public void draw() {
        System.out.println("Dashed");
        shapeToDecorate.draw();
    }
}
