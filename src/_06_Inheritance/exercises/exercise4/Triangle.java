package _06_Inheritance.exercises.exercise4;

import _06_Inheritance.practices.Shape;

public class Triangle extends Shape {
    private static final double SIDE_DEFAULT = 1.0;
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1 = SIDE_DEFAULT;
        this.side2 = SIDE_DEFAULT;
        this.side3 = SIDE_DEFAULT;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double p = (this.side1 + this.side2 + this.side3) / 2;
        return Math.pow(p * (p - this.side1) * (p - this.side2) * (p - this.side3), 0.5);
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1 = " + side1 +
                ", side2 = " + side2 +
                ", side3 = " + side3 +
                ", Area = " + this.getArea() +
                ", Perimeter = " + this.getPerimeter() +
                '}';
    }
}
