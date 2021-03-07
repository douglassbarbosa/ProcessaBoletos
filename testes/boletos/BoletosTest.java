package boletos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoletosTest {
	
Boleto boleto;
	
	@BeforeEach
	public void inicializa() {
		boleto = new Boleto("1010072020", "01-03-2021", 237.00);
	}
	
	@Test
	public void testCriaBoleto() {
		Assertions.assertAll("boleto",
				() -> assertEquals("1010072020", boleto.getCode()),
				() -> assertEquals("01-03-2021", boleto.getDate()),
				() -> assertTrue(237.00 == boleto.getValor())						
				);
	}
	
	
	@Test
	public void assertionComHamcrestMatcher() {
		assertThat(boleto.getValor(), equalTo(237.00));
		assertThat(boleto.getDate(), equalTo("01/03/2021"));
		assertThat(boleto.getCode(), notNullValue());
		assertThat(boleto.getCode(), containsString("101"));
		assertThat(boleto, instanceOf(Boleto.class));
	}
}
