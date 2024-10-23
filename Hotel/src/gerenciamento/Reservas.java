package gerenciamento;

public class Reservas {

	private String Nome;
	private String Data_de_entrada;
	private String Data_de_saida = null;
	private String Tipo_de_quarto;
	public Reservas(String nome, String data_de_entrada, String data_de_saida, String tipo_de_quarto) {
		super();
		Nome = nome;
		Data_de_entrada = data_de_entrada;
		Data_de_saida = data_de_saida;
		Tipo_de_quarto = tipo_de_quarto;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getData_de_entrada() {
		return Data_de_entrada;
	}
	public void setData_de_entrada(String data_de_entrada) {
		Data_de_entrada = data_de_entrada;
	}
	public String getData_de_saida() {
		return Data_de_saida;
	}
	public void setData_de_saida(String data_de_saida) {
		Data_de_saida = data_de_saida;
	}
	public String getTipo_de_quarto() {
		return Tipo_de_quarto;
	}
	public void setTipo_de_quarto(String tipo_de_quarto) {
		Tipo_de_quarto = tipo_de_quarto;
	}
	@Override
	public String toString() {
		return "Reservas [Nome=" + Nome + ", Data_de_entrada=" + Data_de_entrada + ", Data_de_saida=" + Data_de_saida
				+ ", Tipo_de_quarto=" + Tipo_de_quarto + "]";
	}
	

	
}
