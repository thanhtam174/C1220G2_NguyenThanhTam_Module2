package _06_Inheritance.exercises.exercise1;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder(4,6,"Yellow");
        System.out.print(cylinder.toString());
        System.out.println(" Volume="+cylinder.getVolume());
    }
}
