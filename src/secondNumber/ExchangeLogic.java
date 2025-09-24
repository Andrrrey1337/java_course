package secondNumber;

import java.util.Scanner;

public class ExchangeLogic {
    private final Scanner scanner = new Scanner(System.in);
    Exchange exchange = new Exchange();

    public ExchangeLogic() {

    }
    public void start() {
        System.out.println("Доступные к обмену валюты: ");
        for (Currency currency : Currency.values()) {
            System.out.println(currency.name() + '(' + currency.getName() + ')');
        }
        System.out.println("Введите валюту которую хотите обменять: ");
        Currency fromCurrency = Currency.valueOf(scanner.next().toUpperCase());

        System.out.println("Введите валюту которую хотите получить: ");
        Currency toCurrency = Currency.valueOf(scanner.next().toUpperCase());

        System.out.println("Введите сумму для обмена: ");
        double value = scanner.nextDouble();

        System.out.printf("Вы получите в %s: %f",String.valueOf(toCurrency), exchange.convert(fromCurrency,toCurrency,value));
    }
}
