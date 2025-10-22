public class Main {
    public static void main(String[] args) {
        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape shape1 = rectangleFactory.createShape();
        shape1.draw();

        ShapeFactory circleFactory = new CircleFactory();
        Shape shape2 = circleFactory.createShape();
        shape2.draw();

        ShapeFactory triangleFactory = new TriangleFactory();
        Shape shape3 = triangleFactory.createShape();
        shape3.draw();
    }
}
