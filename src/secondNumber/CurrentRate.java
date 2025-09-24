package secondNumber;

import java.util.HashMap;
import java.util.Map;

public class CurrentRate {
    private Map<Currency, Double> current = new HashMap<>();

    public CurrentRate() {
        current.put(Currency.RUB, 1.00);
        current.put(Currency.EUR, 98.60);
        current.put(Currency.USD, 83.90);
        current.put(Currency.GBP, 113.01);
        current.put(Currency.JPY, 0.57);
    }

    public double getRate(Currency currency) {
        return current.get(currency);
    }
}
