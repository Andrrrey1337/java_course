package secondNumber;

public enum Currency {
    RUB("Российский Рубль"),
    USD("Доллар США"),
    EUR("Евро"),
    JPY("Японская иена"),
    GBP("Британский фунт");

    private final String name;

    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
