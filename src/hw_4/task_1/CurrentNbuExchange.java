package hw_4.task_1;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class CurrentNbuExchange {
    public static void main(String[] args) {
        getCurrencyExchangeRate("EUR");
        getCurrencyExchangeRate("USD");
        getCurrencyExchangeRate("GBP");
        getCurrencyExchangeRate("PLN");
    }

    static void getCurrencyExchangeRate(String currencyCode) {
        try {
            URL url = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();

                String inputLine;

                while ((inputLine = reader.readLine()) != null) {
                    response.append(inputLine);
                }
                reader.close();

                JSONArray currencies = new JSONArray(response.toString());

                for (int i = 0; i < currencies.length(); i++) {
                    JSONObject currency = currencies.getJSONObject(i);
                    String code = currency.getString("cc");

                    if (code.equals(currencyCode)) {
                        String name = currency.getString("txt");
                        double rate = currency.getDouble("rate");

                        System.out.println("\nCurrency: " + name);
                        System.out.println("Code: " + code);
                        System.out.println("Rate: " + rate);
                    }
                }
            } else {
                System.err.println("Error in connection to API. RESPONSE CODE: " + responseCode);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
