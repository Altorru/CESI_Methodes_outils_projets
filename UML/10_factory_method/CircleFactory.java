
public class CircleFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        return (Circle) () -> System.out.println("Drawing a Circle");
    }
;
    
}
