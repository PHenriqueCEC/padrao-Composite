package informatica;

public class Classe extends Periferico {
    private String tipoComputador;

    public String getTipoComputador() {
        return tipoComputador;
    }

    public void setTipoComputador(String tipoComputador) {
        this.tipoComputador = tipoComputador;
    }

    public Classe(String descricao, String tipoComputador) {
        super(descricao);
        this.tipoComputador = tipoComputador;
    }

    @Override
    public String getPeriferico() {
        return "Classe: " + this.getTipoComputador() + " - Tipo da Classe: " + this.tipoComputador + "\n";
    }
}
