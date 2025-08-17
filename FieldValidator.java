package githubmainapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FieldValidator {

    // Regular expressions
    private static final String NAME_REGEX = "^[A-Z][a-zA-Z\\s\\-]{1,49}$";
    private static final String MIDDLE_INITIAL_REGEX = "^[A-Z]{1}$";
    private static final String SUBJECT_REGEX = "^[A-Za-z0-9\\s.,!?()\\-]{3,100}$";
    private static final String CONTACT_REGEX = "^\\+639\\d{9}$"; // PH format
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final String MESSAGE_REGEX = "^[\\p{L}\\p{N}\\p{P}\\p{Zs}\\r\\n]{5,1000}$";


    public static boolean isValidFirstName(String input) {
        return Pattern.matches(NAME_REGEX, input);
    }

    public static boolean isValidLastName(String input) {
        return Pattern.matches(NAME_REGEX, input);
    }

    public static boolean isValidMiddleInitial(String input) {
        return Pattern.matches(MIDDLE_INITIAL_REGEX, input);
    }

    public static boolean isValidSubject(String input) {
        return Pattern.matches(SUBJECT_REGEX, input);
    }

    public static boolean isValidContactNumber(String input) {
        return Pattern.matches(CONTACT_REGEX, input);
    }

    public static boolean isValidEmail(String input) {
        return Pattern.matches(EMAIL_REGEX, input);
    }

    public static boolean isValidMessage(String input) {
        if (input == null) return false;

        Pattern pattern = Pattern.compile(MESSAGE_REGEX, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
