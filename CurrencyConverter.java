package CurrencyConverter;
import java.util.HashMap;

public class CurrencyConverter {
    private HashMap<String, Double> exchangeRates; // Stores exchange rates

    public CurrencyConverter() {
        exchangeRates = new HashMap<>();
        // Initialize exchange rates - you would fetch these from an API
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.75);
        // Add more exchange rates as needed
    }

    public double convertCurrency(String baseCurrency, String targetCurrency, double amount) {
        // Fetch exchange rates for baseCurrency and targetCurrency from API
        double baseRate = exchangeRates.get(baseCurrency);
        double targetRate = exchangeRates.get(targetCurrency);

        // Perform the conversion
        double convertedAmount = (amount / baseRate) * targetRate;
        return convertedAmount;
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        String baseCurrency = "USD";
        String targetCurrency = "EUR";
        double amount = 100.0;

        double convertedAmount = converter.convertCurrency(baseCurrency, targetCurrency, amount);

        System.out.println(amount + " " + baseCurrency + " is equivalent to " + convertedAmount + " " + targetCurrency);
    }
}
