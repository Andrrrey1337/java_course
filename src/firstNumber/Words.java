package firstNumber;

import java.util.Random;

public class Words {
    private static final String[] WORDS = {"клавиатура", "гитара", "футболка", "окно", "стакан", "компьютер"};

    private static final Random random = new Random();

    public static String getRandomWord() {
        return WORDS[random.nextInt(WORDS.length)];
    }
}
