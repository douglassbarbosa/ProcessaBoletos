package faturas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FaturasTest {

	Fatura fatura;
	
	@BeforeEach
	public void inicializa() {
		fatura = new Fatura("01/03/2021", 1240.00, "Douglas","PENDENTE");
	}
	
	@Test
	public void testCriaFatura() {
		Assertions.assertAll("fatura",
				() -> assertEquals("01/03/2021", fatura.getDate()),
				() -> assertTrue(1240.00 == fatura.getValorTotal()),
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
