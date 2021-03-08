package processaboleto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import boletos.Boleto;
import faturas.Fatura;
import pagamentos.Pagamento;
import processaboleto.Processador;


@DisplayName("Testes do Processador de Boletos")
public class ProcessaboletosTest {

	private Processador processador;
	private Fatura fatura;
	private Pagamento pagamento1;
	private Pagamento pagamento2;
	private Pagamento pagamento3;
	private Boleto boleto1;
	private Boleto boleto2;
	private Boleto boleto3;


	@DisplayName("Iniciando")
	@BeforeEach
	public void inicializa() {
		processador = new Processador();
		fatura = new Fatura("10/03/2021", 1410.00, "Douglas","PENDENTE");
		boleto1 = new Boleto("1010072020", "01/03/2021", 300.00);
		boleto2 = new Boleto("1010082020", "01/03/2021", 700.00);
		boleto3 = new Boleto("1010092020", "01/03/2021", 410.00);
		pagamento1 = new Pagamento(boleto1.getValor(),"05/03/2021","Boleto");
		pagamento2 = new Pagamento(boleto2.getValor(),"05/03/2021","Boleto");
		pagamento3 = new Pagamento(boleto3.getValor(),"05/03/2021","Boleto");
		processador.addPagamento(pagamento1,fatura);
		processador.addPagamento(pagamento2,fatura);
		processador.addPagamento(pagamento3,fatura);
	}
	
	@DisplayName("Estado processamento")
	@Test
	public void testeGetValorTotal() {
		 
		double valorTotal = processador.getValorTotal();
		Assertions.assertEquals(fatura.getValorTotal(), valorTotal);
		Assertions.assertEquals("PAGA",fatura.getStatus());
	}
	
}