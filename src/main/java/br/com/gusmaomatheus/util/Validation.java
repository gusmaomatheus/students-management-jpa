package br.com.gusmaomatheus.util;

import java.math.BigDecimal;
import java.util.regex.Pattern;

public final class Validation {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    private static final String RA_REGEX = "^SC[0-9X]+$";
    private static final Pattern RA_PATTERN = Pattern.compile(RA_REGEX);

    public static boolean isValidEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    public static boolean isValidRA(String ra) {
        return RA_PATTERN.matcher(ra).matches();
    }

    public static boolean isValidGrade(BigDecimal grade) {
        final double doubleGrade = grade.doubleValue();

        return doubleGrade >= 0 && doubleGrade <= 10;
    }
}
