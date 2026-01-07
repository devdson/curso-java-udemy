import java.util.Scanner;

public class LoopComWhile {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        int contador = leitor.nextInt();


        // Contador de numeros pares
        int valor = 2;

        while(valor <= contador) {

            if (valor % 2 == 0) {

                System.out.println(valor);

            }

            valor = valor + 1;
            
        }

        leitor.close();
    }
    
}
