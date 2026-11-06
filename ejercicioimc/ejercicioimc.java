
import java.util.Scanner;

public class ejercicioimc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables declaradas
        double peso;
        double altura;
        double cal;

        //consultas
        
        do{
        System.out.println("Voy a calcular tu IMC (Indice de masa corporal");
        System.out.println("Dame un peso");
        peso = scan.nextDouble();
        if (peso <= 0){
                        System.out.println("\033[1mValor incorrecto!! Repitalo\033[0m");
                }
        }while(peso <= 0);
        
        do{
                
       
        System.out.println("Dame una altura");
        altura = scan.nextDouble();
        if (altura <= 0){
                        System.out.println("\033[1mValor incorrecto!! Repitalo\033[0m");
                }
        }while(altura <= 0);

        
        //calculos
        cal = peso / (altura * altura);

        if (cal > 0  && cal < 18.5){
                System.out.println("Tienes bajo peso");
        }

        if (cal > 18.5 && cal < 24.9){
                System.out.println("Tienes buen peso");
        }

        if (cal > 24.9 && cal < 29.9){
                System.out.println("Tienes sobrepeso");
        }

        if (cal > 29.9){
                System.out.println("Tienes obesidad");
        }


        

    }
}