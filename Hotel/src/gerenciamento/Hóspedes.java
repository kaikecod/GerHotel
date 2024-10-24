package gerenciamento;

public class Hóspedes {

	private String nome_hóspede;
	private String Data_Reserva;
	private Integer Número_de_Reservas;
	private String Tipo_de_quarto;
	
	public Hóspedes(String nome_hóspede, String data_Reserva, Integer número_de_Reservas, String tipo_de_quarto) {
		super();
		this.nome_hóspede = nome_hóspede;
		Data_Reserva = data_Reserva;
		Número_de_Reservas = número_de_Reservas;
		Tipo_de_quarto = tipo_de_quarto;
	}

	public String getNome_hóspede() {
		return nome_hóspede;
	}

	public void setNome_hóspede(String nome_hóspede) {
		this.nome_hóspede = nome_hóspede;
	}

	public String getData_Reserva() {
		return Data_Reserva;
	}

	public void setData_Reserva(String data_Reserva) {
		Data_Reserva = data_Reserva;
	}

	public Integer getNúmero_de_Reservas() {
		return Número_de_Reservas;
	}

	public void setNúmero_de_Reservas(Integer número_de_Reservas) {
		Número_de_Reservas = número_de_Reservas;
	}

	public String getTipo_de_quarto() {
		return Tipo_de_quarto;
	}

	public void setTipo_de_quarto(String tipo_de_quarto) {
		Tipo_de_quarto = tipo_de_quarto;
	}

	@Override
	public String toString() {
		return "Hóspedes [nome_hóspede=" + nome_hóspede + ", Data_Reserva=" + Data_Reserva + ", Número_de_Reservas="
				+ Número_de_Reservas + ", Tipo_de_quarto=" + Tipo_de_quarto + "]";
	}
	
	
	
}
