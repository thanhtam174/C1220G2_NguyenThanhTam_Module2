package _07_abstract_and_iterface.exercises;

import _06_Inheritance.practices.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        _06_Inheritance.practices.Shape shape = new _06_Inheritance.practices.Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
