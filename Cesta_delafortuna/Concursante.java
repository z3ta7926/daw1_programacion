
public class Concursante {

    // AQUI ALMACENAREMOS LA INFORMACION DEL CONCURSANTE Y SU PROGRESO EN EL
    // PROGRAMA
    // ATRIBUTO PRIVADOS
    private String name;
    private int premioAcumulado = 0;

    // CONSTANTE
    public static final int VALOR_BOLA_BLANCA = 100;
    public static final int VALOR_BOLA_AZUL = 200;

    // METODOS--------------------
    // CONSTRUCTOR
    public Concursante(String name, int premioAcumulado) {
        this.name = name;
        this.premioAcumulado = premioAcumulado;

    }

    // SUMA LA CANTIDAD OBTENIDA Y LA AÑADE AL BOTE DEL CONCURSANTE
    public void SumarPremio(char bola) {

        if (bola == 'B') {
            premioAcumulado += VALOR_BOLA_BLANCA;
        } else if (bola == 'A') {
            premioAcumulado += VALOR_BOLA_AZUL;
        } else if (bola == 'N') {
            bancarota();
        }
    }
    // PONE EL PREMIO ACUMULADO A 0 EN CASO DE SALIR UNA BOLA NEGRA

    public void bancarota() {
        premioAcumulado = 0;

    }

    // GETTERS
    public String getName() {
        return name;
    }

    public int getPremioAcumulado() {
        return premioAcumulado;
    }

}
