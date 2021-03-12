package _17_string_and_regex.exercises;


public class NameClassTest {
    private static NameClassExample nameClassExample;
    public static final String[] validName = new String[] { "C2344H", "P7801G", "A0001I" };
    public static final String[] invalidName = new String[] { "c1234h", "C@1234H", "C521G" };

    public static void main(String args[]) {
        nameClassExample = new NameClassExample();
        for (String name : validName) {
            boolean isvalid = nameClassExample.validate(name);
            System.out.println("Class name is " + name +" is valid: "+ isvalid);
        }
        for (String name : invalidName) {
            boolean isvalid = nameClassExample.validate(name);
            System.out.println("Class name is " + name +" is valid: "+ isvalid);
        }
    }
}
