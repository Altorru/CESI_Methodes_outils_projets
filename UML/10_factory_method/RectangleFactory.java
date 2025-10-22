
public class RectangleFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        return (Rectangle) () -> System.out.println("Drawing a Rectangle");
    }
;
    
}
