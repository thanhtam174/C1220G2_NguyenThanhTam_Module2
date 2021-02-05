package _04_class_and_object.exercises;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    static final int SPEED_DEFAULT = 5;
    static final boolean ON_DEFAULT = false;
    static final int RADIUS_DEFAULT = 5;
    static final String COLOR_DEFAULT = "blue";
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public Fan() {
        this.speed = SPEED_DEFAULT;
        this.on = ON_DEFAULT;
        this.radius = RADIUS_DEFAULT;
        this.color = COLOR_DEFAULT;
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

    public boolean getOn() {
        return on;
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
        return "Speed: " + speed + "; Status: " + (on ? "Fan is on" : "Fan is off") + "; Radius: " + radius + "; Color: " + color;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(FAST, true, 10, "Yellow");
        Fan fan2 = new Fan(MEDIUM, false, 5, "Blue");
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }

}
