
import java.util.Scanner;

public class gameinteractive {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = 0;

        //3 primeras opciones....
        
        System.out.println("DESPIERTAS EN UN BOSQUE");
        System.out.println(" 1 - EXPLORAR");
        System.out.println(" 2 - MIRAR A TU ALREDEDOR");
        System.out.println(" 3 - INTENTAS SUBIR A UN ARBOL");

        do {

            System.out.println("QUE QUIERES HACER?? (1-3): ");
            x = scan.nextInt();

            if (x == 1) {
                System.out.println("VES UN LAGO");
                x = 5;
                System.out.println(" 1 - NADAS");
                System.out.println(" 2 - TE QUEDAS MIRANDOLO CON CARA DE TONTO");
                System.out.println(" 3 - MIRAS A TU ALREDEDOR");

                do {
                    System.out.println("QUE QUIERES HACER?? (1-3): ");
                    x = scan.nextInt();

                    if (x == 1) {
                        System.out.println("TE AHOGAS (PA QUE TE METES SI NO SABES NADAR)");
                        x = 5;
                        System.out.println("SE TERMINO (MAL FINAL)");
                    }

                    if (x == 2) {
                        System.out.println("APARECE ALGO DEL AGUA Y..... (MEJOR NO TE DIGO LO QUE PASO -- HAS MUERTO PICHON)");
                        x = 5;
                        System.out.println("SE TERMINO (MAL FINAL)");
                    }

                    if (x == 3) {
                        System.out.println("VES OTRO PALO...... PERO ESTE TIENE UNA NOTA PEGADA");
                        System.out.println(" 1 - LEES LA NOTA");
                        System.out.println(" 2 - TE PONES A PENSAR");
                        System.out.println(" 3 - QUIERES VER EL MUNDO ARDER (ROMPE LA NOTA!!!!!!)");
                        do {
                            System.out.println("QUE QUIERES HACER?? (1-3): ");
                            x = scan.nextInt();
                            if (x == 1) {
                                System.out.println("RECUERDA QUE TIENES EXAMEN DE XML Y NO HAS ESTUDIADO (ESTAS COCKING!!)");
                                x = 5;
                                System.out.println("FINAL SUBJETIVO");
                                System.out.println("PUEDES SER QUE APRUEBES O PUEDE QUE NO (YA SOLO TE QUEDA REZAR)");
                            }

                            if (x == 2) {
                                System.out.println("TIO DEJA DE PENSAR PROGRAMAR O LO QUE ESTES HACIENDO Y PONTE A ESTUDIAR BASE DE DATOS");
                                x = 5;
                                System.out.println("FINAL ESTUDIOSO");
                            }

                            if (x == 3) {
                                System.out.println("LA NOTA SE ROMPE Y NO PASA NADA (QUE TE ESPERABAS?)");
                                x = 5;
                                System.out.println("FINAL ESTUPIDO");
                            }

                        } while (x < 4);

                    }

                } while (x < 4);

            }

            if (x == 2) {
                System.out.println("VES UN PALO (LA VERDAD ESO NO TE SIRVE DE UNA MIERDA)");
                System.out.println(" 1 - TE LO METES POR EL CULO");
                System.out.println(" 2 - LO SUELTAS Y HACES OTRA COSA");
                System.out.println(" 3 - POR QUE ESTOY HACIENDO ESTO :( ");
                System.out.println("QUE QUIERES HACER?? (1-3): ");
                x = scan.nextInt();
                if (x==1){
                    System.out.println("AL FIN LO CONSEGUISTE");
                    x = 5;
                    System.out.println("FINAL DESGARRO ANAL");
                }

                if (x==2){
                    System.out.println("NO SE PROGRAMAR EL VOLVER A LA ANTERIOR OPCION SORRY");
                    x = 5;
                    System.out.println("FINAL POR FALTA DE CONOCIMIENTOS EN PROGRAMACION");
                }

                if (x==3){
                    System.out.println("POR QUE ME ABURRO BASTO EN BASE DE DATOS");
                    x = 5;
                    System.out.println("FINAL");
                }
                
            }

            if (x == 3) {
                System.out.println("TE CAES");

            }

        } while (x < 4);

    }
}
