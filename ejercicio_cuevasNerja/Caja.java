
public class Caja {

    //Atributos Privados Estaticos
    private static double TotalEntradasAdultosVendidas;
    private static double TotalEntradasNiniosVendidas;
    private static double TotalDeAudioguiasVendidas;
    private static double TotalIngresosAcumuladosVendidas;
    private static double TotalDescuentosAplicadosAcumulados;

    //Metodos Principales
    public void RegistrarTicket(Ticket Ticket) {
        TotalEntradasAdultosVendidas = TotalEntradasAdultosVendidas + Ticket.getCant_EntradasAdultos();
        TotalEntradasNiniosVendidas = TotalEntradasNiniosVendidas + Ticket.getCant_EntradasNinios();
        TotalDeAudioguiasVendidas = TotalDeAudioguiasVendidas + Ticket.getCant_AudioGuias();
        TotalIngresosAcumuladosVendidas = TotalIngresosAcumuladosVendidas + Ticket.CalcularTotal();
        
        //Tambien puede utilizar este += y funciona de la misma manera
    }

    public void MostrarResumenDia(Ticket Ticket) {
        System.out.println("==============");
        System.out.println("Arqueo Diario");
        System.out.println("==============");

        System.out.println("Descuentos de Audioguias: ");
        System.out.println(Ticket.CalcularDescuentosAudioguias());
        System.out.println("");

        

    }

}
