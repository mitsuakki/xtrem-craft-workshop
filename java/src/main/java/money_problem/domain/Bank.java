package money_problem.domain;

import java.util.HashMap;
import java.util.Map;

public final class Bank {
    private final Map<String, Double> exchangeRates;

    private Bank(Map<String, Double> exchangeRates) {
        this.exchangeRates = exchangeRates;
    }

    public static Bank withExchangeRate(Currency fromCurrency, Currency toCurrency, double rate) {
        var bank = new Bank(new HashMap<>());
        bank.addExchangeRate(fromCurrency, toCurrency, rate);

        return bank;
    }

    public void addExchangeRate(Currency fromCurrency, Currency toCurrency, double rate) {
        exchangeRates.put(fromCurrency + "->" + toCurrency, rate);
    }

    public double convert(double amount, Currency fromCurrency, Currency toCurrency) throws MissingExchangeRateException {
        if (canConvert(fromCurrency, toCurrency)) {
            return fromCurrency == toCurrency
                    ? amount
                    : amount * exchangeRates.get(fromCurrency + "->" + toCurrency);
        }
        throw new MissingExchangeRateException(fromCurrency, toCurrency);
    }

    private boolean canConvert(Currency fromCurrency, Currency toCurrency) {
        return fromCurrency == toCurrency || exchangeRates.containsKey(fromCurrency + "->" + toCurrency);
    }

}