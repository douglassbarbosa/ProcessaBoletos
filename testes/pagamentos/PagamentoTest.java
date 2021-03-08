package pagamentos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import boletos.Boleto;

public class PagamentoTest {
	
	private Pagamento pagamento;
	private Boleto boleto;
	
	@BeforeEach
	public void inicializa() {
		boleto = new Boleto("1010092020", "01-03-2021", 411.00);
		pagamento = new Pagamento(boleto.getValor(),"05/03/2021","Boleto");
	}
	
	@Test
	public void testCriaBoleto() {
		Assertions.assertAll("pagamento",
				() -> assertEquals(411.00, boleto.getValor()),
				() -> assertEquals("05/03/2021", pagamento.getDataPagamento()),
				() -> assertTrue("Boleto" == pagamento.getTipoPagamento())						
				);
	}
	
}
