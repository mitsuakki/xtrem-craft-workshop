package money_problem.domain;

public class MissingExchangeRateException extends Exception {
    public MissingExchangeRateException(Currency fromCurrency, Currency toCurrency) {
        super(String.format("%s->%s", fromCurrency, toCurrency));
    }
}
