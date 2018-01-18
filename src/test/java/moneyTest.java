import static org.fest.assertions.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

import com.tws.money.Money;

public class moneyTest {

	@Test
	public void compareTest() {
		BigDecimal price = new BigDecimal(1);
		String type = "CNY";
		Money money1 = new Money(type, price);
		Money money2 = new Money(type, price);
		boolean result = money1.compare(money2);
		assertThat(result).isEqualTo(true);
	}
	
}
