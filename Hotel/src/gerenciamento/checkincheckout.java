package gerenciamento;

public class checkincheckout {
    
    private String nomeDoHospede;
    private String dataDeCheckIn;
    private String dataDeCheckOut;
    private Integer numeroDoQuarto;
    private String tipoDeQuarto;
    
    public checkincheckout(String nomeDoHospede, String dataDeCheckIn, String dataDeCheckOut,
            Integer numeroDoQuarto, String tipoDeQuarto) {
        this.nomeDoHospede = nomeDoHospede;
        this.dataDeCheckIn = dataDeCheckIn;
        this.dataDeCheckOut = dataDeCheckOut;
        this.numeroDoQuarto = numeroDoQuarto;
        this.tipoDeQuarto = tipoDeQuarto;
    }
    
    public checkincheckout(String nomeDoHospede, String dataDeCheckIn, Integer numeroDoQuarto,
            String tipoDeQuarto) {
        this.nomeDoHospede = nomeDoHospede;
        this.dataDeCheckIn = dataDeCheckIn;
        this.numeroDoQuarto = numeroDoQuarto;
        this.tipoDeQuarto = tipoDeQuarto;
    }

    public String getNomeDoHospede() {
        return nomeDoHospede;
    }

    public void setNomeDoHospede(String nomeDoHospede) {
        this.nomeDoHospede = nomeDoHospede;
    }

    public String getDataDeCheckIn() {
        return dataDeCheckIn;
    }

    public void setDataDeCheckIn(String dataDeCheckIn) {
        this.dataDeCheckIn = dataDeCheckIn;
    }

    public String getDataDeCheckOut() {
        return dataDeCheckOut;
    }

    public void setDataDeCheckOut(String dataDeCheckOut) {
        this.dataDeCheckOut = dataDeCheckOut;
    }

    public Integer getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public void setNumeroDoQuarto(Integer numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public String getTipoDeQuarto() {
        return tipoDeQuarto;
    }

    public void setTipoDeQuarto(String tipoDeQuarto) {
        this.tipoDeQuarto = tipoDeQuarto;
    }

    @Override
    public String toString() {
        return "CheckinCheckout [nomeDoHospede=" + nomeDoHospede + 
               ", dataDeCheckIn=" + dataDeCheckIn + 
               ", dataDeCheckOut=" + dataDeCheckOut + 
               ", numeroDoQuarto=" + numeroDoQuarto + 
               ", tipoDeQuarto=" + tipoDeQuarto + "]";
    }

    public String toStringCheckIn() {
        return "Checkin [nomeDoHospede=" + nomeDoHospede + 
               ", dataDeCheckIn=" + dataDeCheckIn + 
               ", numeroDoQuarto=" + numeroDoQuarto + 
               ", tipoDeQuarto=" + tipoDeQuarto + "]";
    }

    public String toStringCheckOut() {
        return "Checkout [nomeDoHospede=" + nomeDoHospede + 
               ", dataDeCheckOut=" + dataDeCheckOut + 
               ", numeroDoQuarto=" + numeroDoQuarto + 
               ", tipoDeQuarto=" + tipoDeQuarto + "]";
    }
}
