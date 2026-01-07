import java.util.Scanner;

public class ex01 {

//Escreva um programa para declarar duas variáveis do tipo inteiro e calcular sua soma.
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = leitor.nextInt();

        float soma = n1 + n2;
        System.out.println("A soma de " + n1 + " e " + n2 + " é " + soma);
        
        leitor.close();
        
    }

}
