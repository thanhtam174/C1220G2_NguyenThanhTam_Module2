package _07_abstract_and_iterface.exercises.colorable_test;

import _07_abstract_and_iterface.exercises.Circle;
import _07_abstract_and_iterface.exercises.Rectangle;
import _07_abstract_and_iterface.exercises.Shape;
import _07_abstract_and_iterface.exercises.Square;

public class ColorableTest {
    public static void display(Shape[] shape) {
        for (Shape element : shape) {
            if (element instanceof Circle) {
                System.out.print(((Circle) element).getArea() + "; ");
            } else if (element instanceof Square) {
                System.out.print(((Square) element).getArea() + ", ");
                ((Square) element).howToColor();
            } else {
                System.out.print(((Rectangle) element).getArea() + "; ");
            }
        }

    }

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(4, 7);
        Square square = new Square(5);
        Shape[] shape = {rectangle, square, circle};
        System.out.println("Dien tich cac hinh trong mang:");
        display(shape);
    }
}
