
import java.util.Currency;
import java.util.Locale;

public class CurrencyChecker {

  public static void main(String[] args) {

  Currency currency = Currency.getInstance(Locale.UK);

  System.out.println("In the United Kingdom the currency is " + currency.getCurrencyCode() +".");
}


}


   
   


