import java.text.NumberFormat;
import java.math.BigDecimal;

public class Interest {

	public static void main(String[] args) {
		
		BigDecimal principal = BigDecimal.valueOf(1000.0);
		BigDecimal price = BigDecimal.valueOf(0.05);
		
		System.out.printf("%s%20s%n", "year", "Amount on deposit");
		
		for(int year = 1; year <= 10; year++) {
			BigDecimal amount =
					principal.multiply(BigDecimal.ONE).pow(year);
			
			
			System.out.printf("%4d%20s%n", year, 
					NumberFormat.getCurrencyInstance().format(amount));
				
		}

	}

}
