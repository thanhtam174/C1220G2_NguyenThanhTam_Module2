package _06_Inheritance.exercises.exercise1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle=new Circle(5,"Blue");
        System.out.print(circle.toString());
        System.out.println(" Area="+circle.getArea());
    }
}
