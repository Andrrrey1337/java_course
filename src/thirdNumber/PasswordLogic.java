package thirdNumber;

import java.util.Scanner;

public class PasswordLogic {
    private static Scanner scanner = new Scanner(System.in);
    Generator generator = new Generator();
    public void start() {
        int length;
        while (true) {
            System.out.println("Введите длину пароля (от 8 до 12): ");
            length = scanner.nextInt();
            if (length < 13 && length > 7) {
                break;
            } else {
                System.out.println("Введено неверное число");
            }
        }
        System.out.println(generator.generate(length));

    }
}
