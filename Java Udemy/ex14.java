import java.util.Scanner;

/*Escreva um programa Java que utilize o operador ternário para determinar se um
número fornecido pelo usuário é par ou ímpar, exibindo uma mensagem
correspondente.
 */

public class ex14 {

    public static void main(String[] args) {
        
        System.out.println("Digite um número.");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String resultado = (n % 2 == 0) ? "Par." : "Ímpar.";

        System.out.println("O número é " + resultado);

        scanner.close();
    }
    
}
