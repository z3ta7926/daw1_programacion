
import java.util.Scanner;

public class ejercicio_CuevaNerja {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double adulto€ = 9.60;
        double niño€ = 4.95;
        double audioguia€ = 3.50;
        double descuento = 0.17;
        String € = "€";
        double subtotal = 0;

        System.out.print("Nombre de cliente: ");

        System.out.print("\33[31m");
        String nom_cliente = scan.next();
        System.out.print("\33[0m");

        System.out.print("Numero entradas adultos: ");

        System.out.print("\33[31m");
        int num_ent_ad = scan.nextInt();
        System.out.print("\33[0m");

        System.out.print("Numero entradas niños: ");
        System.out.print("\33[31m");
        int num_ent_ni = scan.nextInt();
        System.out.print("\33[0m");

        System.out.print("Numero audioguias: ");
        System.out.print("\33[31m");
        int num_audio = scan.nextInt();
        System.out.print("\33[0m");

        double precio_adulto = adulto€ * num_ent_ad;
        double precio_niño = niño€ * num_ent_ni;
        double precio_guias = audioguia€ * num_audio;
        double descuento_guias = precio_guias * descuento;

        subtotal = precio_adulto + precio_guias + precio_niño;
        double total = subtotal - descuento_guias;

        System.out.println(" ");
        System.out.println("===============================================================");
        System.out.println("                       Cueva de Nerja                  ");
        System.out.println("=============================================================== ");
        System.out.println("Cliente: " + nom_cliente);
        System.out.println(" ");

        System.out.println("Producto                                    Cant.      Importe");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Adultos                                %10d %10.2f %s\n", num_ent_ad, precio_adulto, €);
        System.out.printf("Niños                                  %10d %10.2f %s\n", num_ent_ni, precio_niño, €);
        System.out.printf("Guías                                  %10d %10.2f %s\n", num_audio, precio_guias, €);
        System.out.println("--------------------------------------------------------------");
        System.out.println(" ");
        System.out.printf("Subtotal:                                         %10.2f €\n", subtotal);
        System.out.printf("Descuento guías:                                  %10.2f €\n", descuento_guias);

        System.out.printf("\33[1m\33[47m\33[31mTOTAL A PAGAR:                                    %10.2f €\33[0m", total);
        System.out.println("=============================================================== ");

    }
}
