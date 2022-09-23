import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

            Rectangle r1 = new Rectangle(3, 4);
            Triangle t1 = new Triangle(2, 3);
            Elipse e1 = new Elipse(2, 4);

       ArrayList<Shape> shapes = new ArrayList<>();

       shapes.add(r1);
       shapes.add(t1);
       shapes.add(e1);

       Shape shape1 = e1;
       ShapeWithSides shape = r1;
    }
}