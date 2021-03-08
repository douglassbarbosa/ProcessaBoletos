package processaboleto;

import java.util.ArrayList;
import faturas.*;
import pagamentos.Pagamento; 

	
public class Processador {
	double valorTotal = 0.0;
	
	private ArrayList processador;
	
	public void Processodor() {
		processador = new ArrayList();
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void addPagamento(Pagamento pagamento, Fatura fatura) {
		valorTotal += pagamento.getValorPago();

		if (fatura.getValorTotal() >= valorTotal) {
			fatura.status = "PAGA";
		}
	}
}