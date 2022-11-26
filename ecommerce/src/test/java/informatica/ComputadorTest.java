package informatica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputadorTest {

    @Test
    void deveRetornarItensPerifericosComputador() {
        Padrao padrao1 = new Padrao("Modelo intel i5");
        Classe classe11 = new Classe("Mouse lennovo", "Gamer");
        Classe classe12 = new Classe("Memoria 8Gb", "Velocidade");
        Classe classe13 = new Classe("Placa de video AMD Radeon RX", "Graficos");
        Classe classe14 = new Classe("SSD 500Gb", "Armazenamento");
        padrao1.addPeriferico(classe11);
        padrao1.addPeriferico(classe12);
        padrao1.addPeriferico(classe13);
        padrao1.addPeriferico(classe14);

        Padrao padrao2 = new Padrao("Modelo i7");
        Classe classe21 = new Classe("Memoria 16Gb", "Velocidade");
        Classe classe22 = new Classe("Placa de video GTX 3080", "Graficos");
        padrao2.addPeriferico(classe21);
        padrao2.addPeriferico(classe22);


        Padrao padrao3 = new Padrao("Modelo i9");
        Classe classe31 = new Classe("Mouse razer", "Gamer");
        Classe classe32 = new Classe("Memoria 32Gb", "Velocidade");
        Classe classe33 = new Classe("SSD 1Tb", "Armazenamento");
        padrao3.addPeriferico(classe31);
        padrao3.addPeriferico(classe32);
        padrao3.addPeriferico(classe33);

        Padrao item = new Padrao("Perifericos Computador");
        item.addPeriferico(padrao1);
        item.addPeriferico(padrao2);
        item.addPeriferico(padrao3);

        Computador computador = new Computador();
        computador.setItem(item);

        assertEquals(
                "Periferico: Perifericos Computador\n" +
                        "Periferico: Modelo intel i5\n" +
                        "Classe: Gamer - Tipo da Classe: Gamer\n" +
                        "Classe: Velocidade - Tipo da Classe: Velocidade\n" +
                        "Classe: Graficos - Tipo da Classe: Graficos\n" +
                        "Classe: Armazenamento - Tipo da Classe: Armazenamento\n" +
                        "Periferico: Modelo i7\n" +
                        "Classe: Velocidade - Tipo da Classe: Velocidade\n" +
                        "Classe: Graficos - Tipo da Classe: Graficos\n" +
                        "Periferico: Modelo i9\n" +
                        "Classe: Gamer - Tipo da Classe: Gamer\n" +
                        "Classe: Velocidade - Tipo da Classe: Velocidade\n" +
                        "Classe: Armazenamento - Tipo da Classe: Armazenamento\n",
                item.getPeriferico()

        );
    }
}
