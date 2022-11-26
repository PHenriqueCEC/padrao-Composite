package informatica;

import java.util.ArrayList;
import java.util.List;

public class Padrao extends Periferico {

    private List<Periferico> perifericos;

    public Padrao(String descricao) {
        super(descricao);
        this.perifericos = new ArrayList<Periferico>();
    }

    public void addPeriferico(Periferico periferico) {
        this.perifericos.add(periferico);
    }
    @Override
    public String getPeriferico() {
        String saida = "";
        saida = "Periferico: " + this.getDescricao() + "\n";
        for (Periferico periferico : perifericos) {
            saida += periferico.getPeriferico();
        }
        return saida;
    }
}
