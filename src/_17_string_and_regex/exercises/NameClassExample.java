package _17_string_and_regex.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClassExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NAMECLASS_REGEX="^[CAP][0-9]{4}+[G-M]$";

    public NameClassExample(){
        pattern=Pattern.compile(NAMECLASS_REGEX);
    }

    public boolean validate(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
