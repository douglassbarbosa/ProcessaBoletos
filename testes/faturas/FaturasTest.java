package faturas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FaturasTest {

	Fatura faturas;
	
	@BeforeEach
	public void inicializa() {
		fatura = new Fatura("10/03/2021", 1240.00, "Douglas","PENDENTE");
	}
	
	@Test
	public void testCriaFatura() {
		Assertions.assertAll("fatura",
				() -> assertEquals("01-03-2021", fatura.getDate()),
				() -> assertTrue(1240.00 == boleto.getValorTotal()),
				() -> assertEquals("Douglas", fatura.getNome()),
				() -> assertEquals("PENDENTE", fatura.getStatus())
				);
	}
	
	
	@Test
	public void assertionComHamcrestMatcher() {
		assertThat(fatura.getValorTotal(), equalTo(1240.00));
		assertThat(fatura.getDate(), equalTo("01/03/2021"));
		assertThat(fatura.getNome(), notNullValue());
		assertThat(fatura.getNome(), containsString("Dou"));
		assertThat(fatura, instanceOf(Fatura.class));
	}
}
