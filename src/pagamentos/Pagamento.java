package pagamentos;


public class Pagamento {


	private double valorPago;
	private String data;
	private String tipo;
	

	public Pagamento(double valorPago, String data, String tipo) {
		super();
		this.valorPago = valorPago;
		this.data = data;
		this.tipo = tipo;
	}


	public double getValorPago() {
		return valorPago;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public String getDataPagamento() {
		return data;
	}
	public void setDataPagamento(String data) {
		this.data = data;
	}
	
	public String getTipoPagamento() {
		return tipo;
	}
	public void setTipoPagamento(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public boolean equals(Object p) {
		return ((Pagamento) p).getDataPagamento().equals(this.getDataPagamento());
	}
}
