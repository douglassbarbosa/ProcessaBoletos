package boletos;

public class Boleto {

	private String codigo;
	private String data;
	private double valor;

	
	public Boleto(String codigo, String data, double valor) {
		super();
		this.codigo = codigo;
		this.data = data;
		this.valor = valor;
	}
	
	public String getCode() {
		return codigo;
	}
	public void setCode(String codigo) {
		this.codigo = codigo;
	}

	public String getDate() {
		return data;
	}
	public void setCodigo(String data) {
		this.data = data;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public boolean equals(Object p) {
		return ((Boleto) p).getCode().equals(this.getCode());
	}
	

}
