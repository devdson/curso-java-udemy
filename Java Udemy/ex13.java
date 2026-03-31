import java.util.Scanner;

/*Escreva um programa Java que utilize a estrutura de controle switch-case para
determinar o dia da semana com base em um número fornecido pelo usuário (1 para
Domingo, 2 para Segunda-feira, etc.), exibindo uma mensagem correspondente. */

public class ex13 {

    public static void main(String[] args) {

        System.out.println("Digite um número. Cada número de 1 a 7 corresponde a um dia da semana.");

        Scanner scanner = new Scanner(System.in);
        int dia = scanner.nextInt();

        String resultado = switch (dia) {

            case 1 -> "domingo";
            case 2 -> "segunda";
            case 3 -> "terça";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            case 7 -> "sábado";
            default -> "Número inválido";
        };

        System.out.println("Dia da semana: " + resultado);
        
        scanner.close();
    }
    
}
