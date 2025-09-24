package secondNumber;

public class Exchange {
    CurrentRate currentRate = new CurrentRate();
    public double convert(Currency fromCurrency, Currency toCurrency, double quantity) {
        return currentRate.getRate(fromCurrency) * quantity / currentRate.getRate(toCurrency);
    }
}
