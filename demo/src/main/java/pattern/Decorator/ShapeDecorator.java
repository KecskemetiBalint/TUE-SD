package pattern.Decorator;

public abstract class ShapeDecorator implements IShape {
    protected IShape shapeToDecorate;

    public ShapeDecorator(IShape shapeToDecorate) {
        this.shapeToDecorate = shapeToDecorate;
    }

    @Override
    public void draw() {
        System.out.println("Abstarct draw");
        shapeToDecorate.draw();
    }
}
