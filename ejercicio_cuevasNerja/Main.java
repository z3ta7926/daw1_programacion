
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables declaradas
        int EntradasAdultos = 0;
        int EntradasNinios = 0;
        int PackAudioguias = 0;
        String Nombre;
        try {
            System.out.println("¿Cual es su nombre?");
            Nombre = scan.nextLine();
            do {
                System.out.println("Entradas adultos?: ");
                EntradasAdultos = scan.nextInt();
                if (EntradasAdultos < 1) {
                    System.out.println("No es valido");
                }
            } while (EntradasAdultos <= 0);
            System.out.println("Entradas Ninios?: ");
            do {
                EntradasNinios = scan.nextInt();
            } while (EntradasNinios <= 0);
            do {
                System.out.println("Cantidad de Guias?: ");
                PackAudioguias = scan.nextInt();
            } while (PackAudioguias <= 0);

        } catch (Exception e) {
            System.out.println("Ha introducido un caracter invalido!! Repitalo");

        }
    }
}
