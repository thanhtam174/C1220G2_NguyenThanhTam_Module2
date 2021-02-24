package _07_abstract_and_iterface.exercises;

import _06_Inheritance.practices.Square;

public class SquareTest {
    public static void main(String[] args) {
        _06_Inheritance.practices.Square square = new _06_Inheritance.practices.Square();
        System.out.println(square);

        square = new _06_Inheritance.practices.Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
