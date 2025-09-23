package firstNumber;

import java.util.Scanner;

public class GallowsLogic {
    private static final int MAX_LIVES = 6;
    private int lives = 6;
    private String wordToGuess;
    private StringBuilder word;
    private boolean won;
    private Scanner scanner = new Scanner(System.in);

    public GallowsLogic() {
        won = false;
        word = new StringBuilder();
    }

    public void startGame() {
        wordToGuess = Words.getRandomWord();
        for (int i = 0; i < wordToGuess.length(); i++) {
            word.append('_');
        }

        while (lives > 0 && !won) {
            System.out.printf("У вас жизней: %d\nСлово: %s\nВведите букву: ", lives, word);
            String input = scanner.next();

            if (input.length() != 1) {
                System.out.println("Введите одну букву: ");
                continue;
            }
            char letter = input.charAt(0);
            if (!updateWord(letter)) {
                lives--;
            }

            if (wordToGuess.equals(word.toString())) {
                won = true;
            }
            humanAnim.draw(MAX_LIVES - lives);
        }
        if (won) {
            System.out.println("Поздравляем! Вы угадали слово: " + wordToGuess + '!');
        }
        else {
            System.out.println("Вы проиграли. Загаданное слово: " + wordToGuess);
        }
    }

    private boolean updateWord(char letter) {
        int index = wordToGuess.indexOf(letter);
        if (index == -1) {
            System.out.println("Такой буквы нет в слове");
            return false;
        }
        word.setCharAt(index, letter);
        System.out.println("Такая буква есть в слове");
        return true;
    }
}
