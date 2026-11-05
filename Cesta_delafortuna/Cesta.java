
import java.util.Random;

public class Cesta {

    // DE AQUI VA A SACAR EL CONCURSANTE LA BOLA
    // ATRIBUTOS PRIVADOS
    private int bolasBlancas = 10;
    private int bolasAzules = 1;
    private int bolasNegras = 1;

    // CONSTRUCTORES
    public Cesta(int bolasBlancas, int bolasAzules, int bolasNegras) {
        this.bolasBlancas = bolasBlancas;
        this.bolasAzules = bolasAzules;
        this.bolasNegras = bolasNegras;

    }

    // METODOS
    // AQUI VAMOS A OBTENER EL TOTAL DE BOLAS QUE SON 12 BOLAS
    public int obtenerTotalBolas() {

        int totalBolas = bolasBlancas + bolasAzules + bolasNegras;

        if (totalBolas == 0) {
            System.out.println("NO HAY MAS BOLAS");

        }

        return totalBolas;
    }

    // AQUI VAMOS A HACER UN SISTEMA ALEATORIO PARA QUE DE BOLAS A DIESTRO Y SINIESTRO MIENTRAS HAYA BOLAS
    public int extraerBolas() {

        Random rand = new Random();

        int tirada = rand.nextInt(obtenerTotalBolas()) + 1;

        return tirada;
    }

    // AQUI VAMOS A SACAR LA BOLA EXTRAIDA Y A QUITAR 1 CADA QUE SALGA UN COLOR ADEMAS DE INDICAR DICHO COLOR
    public char sacarBolas() {

        int tirada = extraerBolas();

        if (tirada <= bolasBlancas) {
            bolasBlancas--;
            return 'B'; // BOLA BLANCA
        }

        if (tirada <= bolasBlancas + bolasAzules) {
            bolasAzules--;
            return 'A'; // BOLA AZUL

        } else {
            bolasNegras--;
            return 'N'; // BOLA NEGRA
        }

    }

    // GETTERS
    public int getBolasBlancas() {
        return bolasBlancas;
    }

    public int getBolasAzules() {
        return bolasAzules;
    }

    public int getBolasNegras() {
        return bolasNegras;
    }

}
