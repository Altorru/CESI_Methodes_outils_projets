
public class TriangleFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        return (Triangle) () -> System.out.println("Drawing a Triangle");
    }
;
    
}
