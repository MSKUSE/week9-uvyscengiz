import java.util.ArrayList;

public class TestShapes {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(3, 4);

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.toString());

        Shape rectangle1 = new Rectangle(3, 4);
        System.out.println(rectangle1.area());
        System.out.println(rectangle1.perimeter());
        System.out.println(rectangle1.toString());

        Shape square = new Rectangle(3, 3);
        System.out.println(square.area());
        System.out.println(square.perimeter());

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(rectangle);
        shapes.add(rectangle1);
        shapes.add(square);

        for (Shape shape : shapes) {
            System.out.println(shape.area());
            System.out.println(shape.perimeter());
            System.out.println(shape.toString());
        }
    }
}
