package _07_abstract_and_iterface.exercises;

import _06_Inheritance.practices.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        _06_Inheritance.practices.Rectangle rectangle = new _06_Inheritance.practices.Rectangle();
        System.out.println(rectangle);

        rectangle = new _06_Inheritance.practices.Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
