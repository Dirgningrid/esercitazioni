package ingrid.geolocalizzatore;

/**
 * Created by Ingrid on 24/03/2016.
 */
public class Address {
    private String tipoVia;
    private String indirizzo;
    private String numCivico;
    private String citta;


    public String getTipoVia() {
        return tipoVia;
    }
    public void setTipoVia(String tipoVia) {
        this.tipoVia = tipoVia;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public String getNumCivico() {
        return numCivico;
    }
    public void setNumCivico(String numCivico) {
        this.numCivico = numCivico;
    }

    public String getCitta() {
        return citta;
    }
    public void setCitta(String citta) {
        this.citta = citta;
    }
}
