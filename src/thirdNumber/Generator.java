package thirdNumber;

import java.util.*;

public class Generator {
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_SYMBOL = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    private final Random random = new Random();

    public String generate(int len) {
        List <Character> string = new ArrayList<>();
        StringBuilder allString = new StringBuilder();
        allString.append(UPPERCASE).append(LOWERCASE).append(DIGITS).append(SPECIAL_SYMBOL);
        string.add( UPPERCASE.charAt(random.nextInt(UPPERCASE.length())));
        string.add(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));
        string.add(DIGITS.charAt(random.nextInt(DIGITS.length())));
        string.add(SPECIAL_SYMBOL.charAt(random.nextInt(SPECIAL_SYMBOL.length())));
        for (int i = 4; i < len; i++) {
            string.add(allString.charAt(random.nextInt(allString.length())));
        }
        Collections.shuffle(string);
        StringBuilder sb = new StringBuilder();
        for (Character c : string) {
            sb.append(c);
        }
        return sb.toString();
    }
}
