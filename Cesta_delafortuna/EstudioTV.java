
import java.util.InputMismatchException;
import java.util.Scanner;

//INTERACCION CON EL USUARIO Y CICLO DEL PROGRAMA
public class EstudioTV {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion = 0;

        // VARIABLES PARA CLASE CESTA
        int bolBlancas = 10;
        int bolAzules = 1;
        int bolNegras = 1;

        // VARIABLES PARA CLASE CONCURSANTE
        String name;
        int precacumulado = 0;

        System.out.println(" Dame un nombre: ");
        name = scan.nextLine();

        // OBJETOS PARA CLASES
        Cesta cesta = new Cesta(bolBlancas, bolAzules, bolNegras);
        Concursante concursante = new Concursante(name, precacumulado);

        char bola = ' ';

        do {

            System.out.println(" 1 - Sacar bola de la cesta ");
            System.out.println(" 2 - Plantarse y llevarse el dinero ");
            System.out.println(" Actualmente tienes " + concursante.getPremioAcumulado() + " Euros ");

            try {
                System.out.println("Introduzca una de las dos opciones (1-2): ");
                opcion = scan.nextInt();

                if (opcion == 1) {
                    bola = cesta.sacarBolas();
                    concursante.SumarPremio(bola);
                    System.out.println(" La bola que ha salido es: " + bola);
                    if (bola == 'N') {
                        System.out.println(" Has perdido todo tu dinero acumulado " + concursante.getPremioAcumulado());
                    }
                }

                if (opcion == 2) {
                    System.out.println(" FIN DEL JUEGO HAS GANADO " + concursante.getPremioAcumulado() + "Euros");
                }

            } catch (InputMismatchException ex) {
                System.out.println(" El presentador no te ha entendido por favor pulsa (1-2): ");
                scan.next();
                opcion = 0;
            }

        } while (opcion != 2 && cesta.obtenerTotalBolas() > 0 && bola != 'N');

        scan.close();

    }
}
