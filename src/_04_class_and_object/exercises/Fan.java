package _04_class_and_object.exercises;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public Fan() {

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public String getOn() {
        String status;
        if (on) {
            status = "Fan is on";
        } else {
            status = "Fan is off";
        }
        return status;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Speed: " + speed + "; Status: " + getOn() + "; Radius: " + radius + "; Color: " + color;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(FAST, true, 10, "Yellow");
        Fan fan2 = new Fan(MEDIUM, false, 5, "Blue");
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }

}
