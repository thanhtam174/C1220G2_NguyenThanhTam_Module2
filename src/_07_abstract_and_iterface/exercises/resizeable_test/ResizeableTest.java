package _07_abstract_and_iterface.exercises.resizeable_test;

import _07_abstract_and_iterface.exercises.Circle;
import _07_abstract_and_iterface.exercises.Rectangle;
import _07_abstract_and_iterface.exercises.Shape;
import _07_abstract_and_iterface.exercises.Square;

public class ResizeableTest {
    public static void display(Shape[] shape){
        for (Shape element:shape){
            if (element instanceof Circle){
                System.out.print(((Circle) element).getArea() + "; ");
            }else if (element instanceof Rectangle){
                System.out.print(((Rectangle) element).getArea() + "; ");
            }else {
                System.out.print(((Square) element).getArea() + "; ");
            }
        }

    }
    public static void main(String[] args) {
        Circle circle=new Circle(4);
        Rectangle rectangle=new Rectangle(4,9);
        Square square=new Square(4);
        Shape[] shape ={circle,rectangle,square};
        System.out.println("Dien tich truoc khi thay doi:");
        display(shape);
        System.out.println();
        for (Shape element:shape){
            if (element instanceof Circle){
                ((Circle) element).resize(Math.random()*100);
            }else if (element instanceof Rectangle){
                ((Rectangle) element).resize(Math.random()*100);
            }else {
                ((Square) element).resize(Math.random()*100);
            }
        }
        System.out.println("Dien tich sau khi thay doi:");
        display(shape);
    }
}
