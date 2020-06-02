import Shapes.Rectangle;
public class TestRectangle {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(2 , 7);
        Rectangle rect2= new Rectangle(5,9);

        System.out.println("Area of first object="+rect1.getArea());
        System.out.println("Perimeter of first object="+rect1.getPerimeter());
        System.out.println("Area of second object="+rect2.getArea());
        System.out.println("Perimeter of second object="+rect2.getPerimeter());
    }

}
