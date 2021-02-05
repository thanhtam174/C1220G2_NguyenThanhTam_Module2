package _05_access_modifier.exercises;

public class Circle {
    static final double RADIUS_DEFAULT = 1.0;
    static final String COLOR_DEFAULT = "blue";
    private double radius;
    private String color;

    public Circle() {
        this.radius = RADIUS_DEFAULT;
        this.color = COLOR_DEFAULT;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        circle.setColor("Yellow");
        circle.setRadius(5);
        System.out.println(circle.getArea());
    }
}
