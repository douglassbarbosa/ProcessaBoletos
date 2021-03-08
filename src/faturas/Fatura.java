package faturas;

public class Fatura {


	private String date;
	private double valorTotal;
	private String nome;
	public String status;

	
	public Fatura(String date, double valorTotal, String nome, String status) {
		super(); 
		this.date = date;
		this.valorTotal = valorTotal;
		this.nome = nome;
		this.status = status;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNomeigo(String nome) {
		this.nome = nome;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public boolean equals(Object p) {
		return ((Fatura) p).getDate().equals(this.getDate());
	}
	
	
}
