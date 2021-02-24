package _07_abstract_and_iterface.exercises;

import _06_Inheritance.practices.Circle;

public class CircleTest {
    public static void main(String[] args) {
        _06_Inheritance.practices.Circle circle = new _06_Inheritance.practices.Circle();
        System.out.println(circle);

        circle = new _06_Inheritance.practices.Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
