
public class Ticket {

    //Atributos privados
    private int Cant_EntradasAdultos;
    private int Cant_EntradasNinios;
    private int Cant_AudioGuias;
    //constantes
    public static double Prec_EntradasAdultos = 9.60;
    public static double Prec_EntradasNinios = 4.95;
    public static double Prec_audioguias = 3.50;
    public static double Desc_Audioguias = 0.17;

    //Contructor Parametrizado
    public Ticket(int Cant_EntradasAdultos, int Cant_EntradasNinios, int Cant_AudioGuias) {
        this.Cant_EntradasAdultos = Cant_EntradasAdultos;
        this.Cant_EntradasNinios = Cant_EntradasNinios;
        this.Cant_AudioGuias = Cant_AudioGuias;
    }

    //Metodos Principales
    public double CalcularSubTotal() {
        double subtotal = Prec_EntradasAdultos + Prec_EntradasNinios + Prec_audioguias;
        return subtotal;
    }

    public double CalcularDescuentosAudioguias() {
        double Descuentos_Audioguias = Prec_audioguias + (Prec_audioguias * Desc_Audioguias);
        return Descuentos_Audioguias;
    }

    public double CalcularTotal() {
        double Total = Prec_EntradasAdultos + Prec_EntradasNinios + Prec_audioguias + Desc_Audioguias;
        return Total;
    }

    public void ImprimirTicket() {
        System.out.println(" ");
        System.out.println("===============================================================");
        System.out.println("                       Cueva de Nerja                  ");
        System.out.println("=============================================================== ");
        // System.out.println("Cliente: "+nom_cliente);
        System.out.println(" ");

        System.out.println("Producto                                    Cant.      Importe");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Adultos                                %10d %10.2f \n", this.Cant_EntradasAdultos, Prec_EntradasAdultos);
        System.out.printf("Niños                                  %10d %10.2f \n", this.Cant_EntradasNinios, Prec_EntradasNinios);
        System.out.printf("Guías                                  %10d %10.2f \n", this.Cant_AudioGuias, Prec_audioguias);
        System.out.println("--------------------------------------------------------------");
        System.out.println(" ");
        System.out.printf("Subtotal:                                         %10.2f €\n", CalcularSubTotal());
        System.out.printf("Descuento guías:                                  %10.2f €\n", CalcularDescuentosAudioguias());

        System.out.printf("\33[1m\33[47m\33[31mTOTAL A PAGAR:                                    %10.2f €\33[0m", CalcularTotal());
    }

    public int getCant_EntradasAdultos() {
        return Cant_EntradasAdultos;
    }

    public int getCant_EntradasNinios() {
        return Cant_EntradasNinios;
    }

    public int getCant_AudioGuias() {
        return Cant_AudioGuias;
    }

}
