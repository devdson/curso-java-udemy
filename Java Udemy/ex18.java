import java.util.Scanner;

public class ex18 {

/*Crie um programa Java que solicite ao usuário digitar o número do mês (1 para
Janeiro, 2 para Fevereiro, etc.) e utilize a estrutura switch-case para imprimir o
número de dias do mês correspondente.
 */

    public static void main(String[] args) {
        
        System.out.println("Digite um número, cada número equivale a um mês do ano.");

        Scanner scanner = new Scanner(System.in);
        int mes = scanner.nextInt();

        String resultado = switch (mes){

            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro"; 
            default -> "Mês inválido";

        };

        System.out.println(resultado);

        scanner.close();



    }
    
}
