import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRecLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        // Add 10 rectangles
        rectangles.add(new Rectangle(4, 1));
        rectangles.add(new Rectangle(5, 2));
        rectangles.add(new Rectangle(6, 3));
        rectangles.add(new Rectangle(3, 4));
        rectangles.add(new Rectangle(5, 1));
        rectangles.add(new Rectangle(6, 2));
        rectangles.add(new Rectangle(7, 3));
        rectangles.add(new Rectangle(6, 4));
        rectangles.add(new Rectangle(4, 5));
        rectangles.add(new Rectangle(1, 6));

        Filter bigRectangleFilter = new RecFilter();

        System.out.println("Rectangles with perimeter > 10:");
        for (Rectangle rect : rectangles) {
            if (bigRectangleFilter.accept(rect)) {
                System.out.println("Rectangle: width = " + rect.width + ", height = " + rect.height +
                        ", perimeter = " + (2 * (rect.width + rect.height)));
            }
        }
    }
}