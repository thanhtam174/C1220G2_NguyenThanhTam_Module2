package _06_Inheritance.exercises.exercise1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " bottom radius =" + super.getRadius() +
                ", height =" + height +
                ", Color : '" + super.getColor() + "\'" +
                '}';
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }
}
