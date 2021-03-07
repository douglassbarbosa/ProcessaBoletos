package processapagamento;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import boletos.Boleto;


@DisplayName("Testes do carrinho")
public class ProcessapagamentosTest {

	private Processodor processador;
	private Fatura fatura;
	private Pagamento pagamento1;
	private Pagamento pagamento2;
	private Pagamento pagamento3;
	private Boleto boleto1;
	private Boleto boleto2;
	private Boleto boleto3;

	@BeforeEach
	public void inicializa() {
		processador = new processador();
		fatura = new Fatura("10/03/2021", 1410.00, "Douglas","PENDENTE")
		boleto1 = new Boleto("1010072020", 237.00);
		boleto2 = new Boleto("1010082020", 763.00);
		boleto3 = new Boleto("1010092020", 411.00);
		pagamento1 = new Pagamento(boleto1.getValor(),"05/03/2021","Boleto");
		pagamento2 = new Pagamento(boleto2.getValor(),"05/03/2021","Boleto");
		pagamento3 = new Pagamento(boleto3.getValor(),"05/03/2021","Boleto");
		processador.addPagamento(pagamento1);
		processador.addPagamento(pagamento2);
		processador.addPagamento(pagamento3);
	}
	

	@DisplayName("Estado processamento")
	@Test
	public void testeGetStatus() {
		AssertEquals("PAGA", processador.getStatus())
	}
	
}