package gerenciamento;

public class Quartos {
	
	private Integer numero;
	private String Tipo;
	private Float Preco_Unitario;
	private Boolean Disponibilidade = false;
	
	public Quartos(Integer numero, String tipo, Float preco_Unitario, Boolean disponibilidade) {
		super();
		this.numero = numero;
		Tipo = tipo;
		Preco_Unitario = preco_Unitario;
		Disponibilidade = disponibilidade;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public Float getPreco_Unitario() {
		return Preco_Unitario;
	}

	public void setPreco_Unitario(Float preco_Unitario) {
		Preco_Unitario = preco_Unitario;
	}

	public Boolean getDisponibilidade() {
		return Disponibilidade;
	}

	public void setDisponibilidade(Boolean disponibilidade) {
		Disponibilidade = disponibilidade;
	}

	@Override
	public String toString() {
		return "Quartos [numero= " + numero + ", Tipo=" + Tipo + ", Preco_Unitario= " + Preco_Unitario
				+ ", Disponibilidade= " + Disponibilidade + "]";
	}
	

	

}
