package _06_Inheritance.exercises.exercise3;

public class MovveaPointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint=new MoveablePoint();
        moveablePoint.setSpeed(2,3);
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}
