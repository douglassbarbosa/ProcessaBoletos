package boletos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoletosTest {
	
Boleto boleto;
	
	@BeforeEach
	public void inicializa() {
		boleto = new Boleto("Saldo 1", 237.00);
	}
	
	@Test
	public void testCriaBoleto() {
		Assertions.assertAll("livro",
				() -> assertEquals("Saldo 1", boleto.getNome()),
				() -> assertTrue(237.00 == boleto.getValor())						
				);
	}
	
	
	@Test
	public void assertionComHamcrestMatcher() {
		assertThat(boleto.getValor(), equalTo(100.00));
		assertThat(boleto.getNome(), notNullValue());
		assertThat(boleto.getNome(), containsString("Teste"));
		assertThat(boleto, instanceOf(Boleto.class));
	}
}
