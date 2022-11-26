package informatica;

public abstract class Periferico {
    private String descricao;

    public Periferico(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getPeriferico();
}
