package _17_string_and_regex.exercises;

public class PhoneNumberTest {
    private static PhoneNumberExample phoneNumberExample;
    public static final String[] validPhone = new String[] { "(84)-0456982315", "(34)-0124897301", "(12)-0875693012" };
    public static final String[] invalidPhone = new String[] { "(a4)-0554688823", "(84)-1238467520", "(45)0187569321" };

    public static void main(String args[]) {
        phoneNumberExample = new PhoneNumberExample();
        for (String phone : validPhone) {
            boolean isvalid = phoneNumberExample.validate(phone);
            System.out.println("Phone number is " + phone +" is valid: "+ isvalid);
        }
        for (String phone : invalidPhone) {
            boolean isvalid = phoneNumberExample.validate(phone);
            System.out.println("Phone number is " + phone +" is valid: "+ isvalid);
        }
    }
}
